package de.grado.portfoliobackend.controller;

import de.grado.portfoliobackend.dto.ContactDto;
import de.grado.portfoliobackend.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class ContactController {
    private final ContactService contactService;

    @PostMapping("/contact")
    public void contact(ContactDto contactDto) {
        log.info("{}", contactDto);
        contactService.createContact(contactDto);
    }
}
