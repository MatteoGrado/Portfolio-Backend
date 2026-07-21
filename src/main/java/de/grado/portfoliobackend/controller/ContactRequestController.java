package de.grado.portfoliobackend.controller;

import de.grado.portfoliobackend.model.Contact;
import de.grado.portfoliobackend.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class ContactRequestController
{
    private final ContactService contactService;

    @GetMapping("/getContacts")
    public List<Contact> getContacts()
    {
        log.info("All Contact Requests loaded");
        return contactService.getContactRequests();
    }
}
