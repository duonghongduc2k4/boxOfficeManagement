package com.codegym.boxOfficeManagement.repository;

import com.codegym.boxOfficeManagement.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface ITicketRepository extends CrudRepository<Ticket,Long> {
}
