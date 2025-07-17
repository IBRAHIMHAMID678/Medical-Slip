package com.example.medicalslip.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "patient")
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "personal_number")
    private String personalNumber;

    @Column(name = "designation")
    private String designation;

    @Column(name = "scale")
    private String scale;

    @Column(name = "department")
    private String department;

    @Column(name = "place_of_posting")
    private String placeOfPosting;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "nic_no")
    private String nicNo;

    @Column(name = "age")
    private int age;

    @Column(name = "relation_with_employee")
    private String relationWithEmployee;

    @Column(name = "entitlement")
    private String entitlement;
}