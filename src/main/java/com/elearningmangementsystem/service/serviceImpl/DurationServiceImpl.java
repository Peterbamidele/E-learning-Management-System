package com.elearningmangementsystem.service.serviceImpl;

import com.elearningmangementsystem.model.Duration;
import com.elearningmangementsystem.repository.DurationRepository;
import com.elearningmangementsystem.service.DurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DurationServiceImpl implements DurationService {

    @Autowired
    private DurationRepository durationRepository;

    public List<Duration> getAllDuration() {
        List<Duration>durations = durationRepository.findAll();
        return durations;
    }

    public Optional<Duration> getDuration(Integer id) {
        return durationRepository.findById(id);
    }


    public void addDuration(Duration duration) {
        durationRepository.save(duration);
    }

    public void updateDuration(Duration duration, Integer id) {
        durationRepository.save(duration);
    }

    public void deleteDuration(Integer id) {
        durationRepository.deleteById(id);
    }
}
