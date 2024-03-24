package com.codegym.boxOfficeManagement.controller;

import com.codegym.boxOfficeManagement.model.Ticket;
import com.codegym.boxOfficeManagement.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@RestController
@RequestMapping("/tickets")
public class AdminController {
    @Autowired
    private TicketService ticketService;

    @GetMapping()
    public ModelAndView listCustomers() {
        ModelAndView modelAndView = new ModelAndView("/ticket/list");
        modelAndView.addObject("tickets", ticketService.findAll());
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView viewTicket(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/ticket/view");
        Optional<Ticket> ticket = ticketService.findById(id);
        modelAndView.addObject("ticket",ticket.get());
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/ticket/create");
        modelAndView.addObject("ticket", new Ticket());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveTicket(@ModelAttribute("ticket") Ticket ticket) {
        ticketService.save(ticket);
        ModelAndView modelAndView = new ModelAndView("/ticket/create");
        modelAndView.addObject("ticket", new Ticket());
        modelAndView.addObject("message", "New ticket created successfully");
        return modelAndView;
    }

    @GetMapping("/update/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<Ticket> ticket = ticketService.findById(id);
            ModelAndView modelAndView = new ModelAndView("/ticket/update");
            modelAndView.addObject("ticket", ticket.get());
            return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView updateTicket(@ModelAttribute("ticket") Ticket ticket) {
        ticketService.save(ticket);
        ModelAndView modelAndView = new ModelAndView("/ticket/update");
        modelAndView.addObject("ticket", ticket);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<Ticket> ticket = ticketService.findById(id);
            ModelAndView modelAndView = new ModelAndView("/ticket/delete");
            modelAndView.addObject("ticket", ticket.get());
            return modelAndView;
    }

    @PostMapping("/delete")
    public String deleteTicket(@ModelAttribute("ticket") Ticket ticket) {
        ticketService.remove(ticket.getId());
        return "redirect:/tickets";
    }
}
