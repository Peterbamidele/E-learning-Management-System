package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Schedule;
import com.elearningmangementsystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedules")
    public List<Schedule> getAllSchedule(){
        return scheduleService.getAllSchedule();
    }

    @GetMapping("/schedules/{id}")
    public Optional<Schedule> getSchedule(@PathVariable Integer id){
        return scheduleService.getSchedule(id);
    }

    @PostMapping("/schedules")
    public void addSchedule(@RequestBody Schedule schedule){
        scheduleService.addSchedule(schedule);
    }

    @PutMapping("/schedules/{id}")
    public void updateSchedule(@RequestBody Schedule schedule, @PathVariable Integer id){
        scheduleService.updateSchedule(id, schedule);
    }

    @DeleteMapping("/shedules/{id}")
    public void deleteSchedule(@PathVariable Integer id){
        scheduleService.deleteSchedule(id);
    }



}
