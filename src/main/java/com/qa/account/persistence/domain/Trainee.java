package com.qa.account.persistence.domain;

import javax.persistence.*;

@Entity
public class Trainee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long traineeID;
    @Column(length = 100)
    private String traineeName;

    public Trainee() {
    }

    public Trainee(Long traineeID, String traineeName) {
        this.traineeID = traineeID;
        this.traineeName = traineeName;
    }

    public long getTraineeID() {
        return traineeID;
    }

    public void setTraineeID(long traineeID) {
        this.traineeID = traineeID;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }
}
