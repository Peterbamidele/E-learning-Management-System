package com.elearningmangementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "durations")
public class Duration {

    @Id
    private Integer id;

    @OneToOne
    private Course course;

    private String description;

    private String type;

    private Date date;

    private String time;

}
