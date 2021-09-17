package com.elearningmangementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "fess")
public class Fee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String amount;

    private String total;

    private  String payment;

    private String description;

    @OneToOne
    private Course course;




}
