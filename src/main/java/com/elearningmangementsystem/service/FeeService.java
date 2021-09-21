package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Fee;
import com.elearningmangementsystem.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeeService {

    @Autowired
    private FeeRepository feeRepository;

    public List<Fee> getAllFee() {
        List<Fee> fees = feeRepository.findAll();
        return fees;
    }

    public Optional<Fee> getFee(Integer id) {
       return feeRepository.findById(id);
    }

    public void addFee(Fee fee) {
        feeRepository.save(fee);
    }

    public void updateFee(Integer id, Fee fee) {
        feeRepository.save(fee);
    }

    public void deleteFee(Integer id) {
        feeRepository.deleteById(id);
    }
}
