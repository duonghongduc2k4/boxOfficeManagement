package com.codegym.boxOfficeManagement.service;

import com.codegym.boxOfficeManagement.model.Ticket;
import com.codegym.boxOfficeManagement.repository.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService implements ITicketService{
    @Autowired
    private ITicketRepository iTicketRepository;

    @Override
    public Iterable<Ticket> findAll() {
        return iTicketRepository.findAll();
    }

    @Override
    public void save(Ticket t) {
        iTicketRepository.save(t);
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return iTicketRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iTicketRepository.deleteById(id);
    }
}
