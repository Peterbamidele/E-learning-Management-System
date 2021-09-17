package com.elearningmangementsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "permissions")
@Entity
@Data
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @ManyToOne
    private Role role;

    private String title;

    private String module;

    private String description;
}
