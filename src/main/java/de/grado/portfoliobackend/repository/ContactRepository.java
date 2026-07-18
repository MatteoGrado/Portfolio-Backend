package de.grado.portfoliobackend.repository;

import de.grado.portfoliobackend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository  extends JpaRepository<Contact, Long>
{
}
