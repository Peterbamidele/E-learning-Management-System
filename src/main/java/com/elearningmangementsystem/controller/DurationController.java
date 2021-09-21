package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Duration;
import com.elearningmangementsystem.service.DurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class DurationController {
    @Autowired
    private DurationService durationService;

    @GetMapping("/durations")
    public List<Duration> getAllDuration(){
        return durationService.getAllDuration();
    }

    @GetMapping("durations/{id}")
    public Optional <Duration> getDuration(@PathVariable Integer id){
        return durationService.getDuration(id);

    }
    @PostMapping("/durations")
    public void addDuration(@RequestBody Duration duration){
        durationService.addDuration(duration);
    }

    @PutMapping("/durations{id}")
    public void updateDuration(@RequestBody Duration duration, @PathVariable Integer id){
        durationService.updateDuration(duration, id);
    }

    @DeleteMapping("/durations{id}")
    public void deleteDuration(@PathVariable Integer id){
        durationService.deleteDuration(id);
    }



}
