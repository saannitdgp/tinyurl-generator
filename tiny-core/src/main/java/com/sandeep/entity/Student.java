package com.sandeep.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
@Entity
@Setter
@Getter
public class Student {

    private static final long serialVersionUID = 7081012489875224566L;

    @Column(name = "student_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

}

