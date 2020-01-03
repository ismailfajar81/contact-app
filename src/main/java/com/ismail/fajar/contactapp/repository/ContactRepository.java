package com.ismail.fajar.contactapp.repository;

import com.ismail.fajar.contactapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
