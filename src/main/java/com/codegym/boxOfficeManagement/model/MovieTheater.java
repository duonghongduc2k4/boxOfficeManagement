package com.codegym.boxOfficeManagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movieTheater")
public class MovieTheater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public MovieTheater() {
    }

    public MovieTheater(Long id, String name, String address, Room room) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
