package com.codegym.boxOfficeManagement.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String movieGenre;
    @ManyToMany
    @JoinTable(name = "movie_room",
            joinColumns = {@JoinColumn(name = "movie_id")},
            inverseJoinColumns = {@JoinColumn(name = "room_id")})
    private Set<Room> rooms;

    public Movie() {
    }

    public Movie(Long id, String name, String description, String movieGenre, Set<Room> rooms) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.movieGenre = movieGenre;
        this.rooms = rooms;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
