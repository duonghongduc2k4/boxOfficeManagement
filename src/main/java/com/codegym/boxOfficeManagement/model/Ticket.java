package com.codegym.boxOfficeManagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    @ManyToOne
    @JoinColumn(name = "movieTheater_id")
    private MovieTheater movieTheater;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Ticket() {
    }

    public Ticket(Long id, String name, double price, MovieTheater movieTheater, Account account) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.movieTheater = movieTheater;
        this.account = account;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MovieTheater getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(MovieTheater movieTheater) {
        this.movieTheater = movieTheater;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
