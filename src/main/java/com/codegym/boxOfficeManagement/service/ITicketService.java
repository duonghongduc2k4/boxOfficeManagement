package com.codegym.boxOfficeManagement.service;

import com.codegym.boxOfficeManagement.model.Ticket;

import java.util.Optional;

public interface ITicketService {
    Iterable<Ticket> findAll();
    void save(Ticket t);
    Optional<Ticket> findById(Long id);
    void remove(Long id);
}
