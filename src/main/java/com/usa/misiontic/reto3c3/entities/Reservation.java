package com.usa.misiontic.reto3c3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;

@Entity
@Table(name="reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idReservation;
    private String startDate;
    private String devolutionDate;
    private String status;


    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties("reservations")
    private Cloud cloud;
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;

    private Float score;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(String devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}