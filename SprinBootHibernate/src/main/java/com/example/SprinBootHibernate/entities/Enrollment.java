package com.example.SprinBootHibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn
    private Student student;


    @ManyToOne
    @JoinColumn
    private Class aClass;
}
