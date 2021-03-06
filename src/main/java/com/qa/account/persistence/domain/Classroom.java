package com.qa.account.persistence.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classroom {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomID;
    @Column(length = 100)
    private String trainer;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Trainee> trainee;

    public Classroom() {
    }

    public Classroom(Long classroomID, String trainer) {
        this.classroomID = classroomID;
        this.trainer = trainer;
    }

    public long getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(Long classroomID) {
        this.classroomID = classroomID;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setTrainees(List<Trainee> trainee) {
        this.trainee = trainee;
    }
}
