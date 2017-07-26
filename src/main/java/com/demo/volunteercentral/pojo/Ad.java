package com.demo.volunteercentral.pojo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "ad")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotNull
    private String goal;

    @NotNull
    private Integer requestedNumber;

    @NotNull
    private String location;

    @NotNull
    private String author;

    @NotNull
    private Date date;

    @NotNull
    private String[] skills;

    public Ad() {
    }

    public Ad(String goal, Integer requestedNumber, String location, String author, Date date, String[] skills) {
        this.goal = goal;
        this.requestedNumber = requestedNumber;
        this.location = location;
        this.author = author;
        this.date = date;
        this.skills = skills;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Integer getRequestedNumber() {
        return requestedNumber;
    }

    public void setRequestedNumber(Integer requestedNumber) {
        this.requestedNumber = requestedNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
