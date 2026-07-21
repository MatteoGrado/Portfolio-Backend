package de.grado.portfoliobackend.service;

import de.grado.portfoliobackend.dto.ContactDto;
import de.grado.portfoliobackend.model.Contact;
import de.grado.portfoliobackend.repository.ContactRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ContactService {
    private final ContactRepository contactRepository;

    public void createContact(ContactDto contactDto) {
        Contact contact = new Contact();

        contact.setName(contactDto.getName());
        contact.setEmail(contactDto.getEmail());
        contact.setSubject(contactDto.getSubject());
        contact.setMessage(contactDto.getMessage());

        contactRepository.save(contact);
    }

    public List<Contact> getContactRequests()
    {
        return contactRepository.findAll();
    }
}
