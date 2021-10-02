package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Fee;
import com.elearningmangementsystem.service.serviceImpl.FeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class FeeController {

    @Autowired
    private FeeServiceImpl feeServiceImpl;

    @GetMapping("/fees")
    public List<Fee> getAllFee(){
        return feeServiceImpl.getAllFee();
    }

    @GetMapping("/fees/{id}")
    public Optional<Fee> getFee(@PathVariable Integer id){
        return feeServiceImpl.getFee(id);
    }

    @PostMapping("/fees")
    public void addFee(@RequestBody Fee fee){
        feeServiceImpl.addFee(fee);
    }

    @PutMapping("/fees/{id}")
    public void updateFee(@RequestBody Fee fee, @PathVariable Integer id){
        feeServiceImpl.updateFee(id, fee);
    }

    @DeleteMapping("/fees/{id}")
    public void deleteFee(@PathVariable Integer id){
        feeServiceImpl.deleteFee(id);
    }


}
