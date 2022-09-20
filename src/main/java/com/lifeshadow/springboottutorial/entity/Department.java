package com.lifeshadow.springboottutorial.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Please enter department name.")
    private String departmentName;
    @NotBlank(message = "Please enter department address.")
    private String departmentAddress;
    @NotBlank(message = "Please enter department code.")
    @Length(min = 2, max = 10, message = "Please enter department code length in between 1 to 11")
    private String departmentCode;


}
