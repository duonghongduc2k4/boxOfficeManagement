package com.codegym.boxOfficeManagement.model;

import jakarta.persistence.*;
@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int numberOfSeats;
    private String showTimes;

    public Room() {
    }

    public Room(int id, String name, int numberOfSeats, String showTimes) {
        this.id = id;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.showTimes = showTimes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(String showTimes) {
        this.showTimes = showTimes;
    }
}
