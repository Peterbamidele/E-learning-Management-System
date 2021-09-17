package com.elearningmangementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "shedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    private String name;

    private String type;

    private String description;

}
