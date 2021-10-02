package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Duration;
import com.elearningmangementsystem.service.serviceImpl.DurationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class DurationController {
    @Autowired
    private DurationServiceImpl durationServiceImpl;

    @GetMapping("/durations")
    public List<Duration> getAllDuration(){
        return durationServiceImpl.getAllDuration();
    }

    @GetMapping("durations/{id}")
    public Optional <Duration> getDuration(@PathVariable Integer id){
        return durationServiceImpl.getDuration(id);

    }
    @PostMapping("/durations")
    public void addDuration(@RequestBody Duration duration){
        durationServiceImpl.addDuration(duration);
    }

    @PutMapping("/durations{id}")
    public void updateDuration(@RequestBody Duration duration, @PathVariable Integer id){
        durationServiceImpl.updateDuration(duration, id);
    }

    @DeleteMapping("/durations{id}")
    public void deleteDuration(@PathVariable Integer id){
        durationServiceImpl.deleteDuration(id);
    }



}
