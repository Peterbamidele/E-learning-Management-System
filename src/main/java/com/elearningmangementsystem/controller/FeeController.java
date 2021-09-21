package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Fee;
import com.elearningmangementsystem.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class FeeController {

    @Autowired
    private FeeService feeService;

    @GetMapping("/fees")
    public List<Fee> getAllFee(){
        return feeService.getAllFee();
    }

    @GetMapping("/fees/{id}")
    public Optional<Fee> getFee(@PathVariable Integer id){
        return feeService.getFee(id);
    }

    @PostMapping("/fees")
    public void addFee(@RequestBody Fee fee){
        feeService.addFee(fee);
    }

    @PutMapping("/fees/{id}")
    public void updateFee(@RequestBody Fee fee, @PathVariable Integer id){
        feeService.updateFee(id, fee);
    }

    @DeleteMapping("/fees/{id}")
    public void deleteFee(@PathVariable Integer id){
        feeService.deleteFee(id);
    }


}
