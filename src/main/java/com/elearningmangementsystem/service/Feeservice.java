package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Duration;
import com.elearningmangementsystem.model.Fee;

import java.util.List;
import java.util.Optional;

public interface Feeservice {
    List<Fee> getAllFee();
    Optional<Fee> getFee(Integer id);
    void addFee(Fee fee);
    void updateFee(Fee fee, Integer id);
    void deleteFee(Integer id);
}
