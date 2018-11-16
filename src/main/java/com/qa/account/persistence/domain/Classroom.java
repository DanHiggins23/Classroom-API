package com.qa.account.persistence.domain;

import javax.persistence.*;

@Entity
public class Classroom {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classroomID;
    @Column(length = 100)
    private String trainer;
    @OneToMany @JoinColumn(name = "traineeID")
    private String traineeName;
}
