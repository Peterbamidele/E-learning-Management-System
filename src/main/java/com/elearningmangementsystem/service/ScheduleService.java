package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Schedule;
import com.elearningmangementsystem.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedule() {
        List<Schedule>schedules =scheduleRepository.findAll();
        return schedules;
    }

    public Optional<Schedule> getSchedule(Integer id) {
        return scheduleRepository.findById(id);
    }

    public void addSchedule(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    public void updateSchedule(Integer id, Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    public void deleteSchedule(Integer id) {
        scheduleRepository.deleteById(id);
    }


}
