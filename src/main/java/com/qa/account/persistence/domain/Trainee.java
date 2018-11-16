package com.qa.account.persistence.domain;

import javax.persistence.*;

@Entity
public class Trainee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long traineeID;
    @Column(length = 100)
    private String traineeName;
}
