package com.qa.account.persistence.domain;

import javax.persistence.*;

@Entity
public class Classroom {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomID;
    @Column(length = 100)
    private String trainer;
//    @OneToMany @JoinColumn(name = "traineeID")
//    private String traineeName;

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
}
