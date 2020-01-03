package com.ismail.fajar.contactapp.controller;

import com.ismail.fajar.contactapp.model.Contact;
import com.ismail.fajar.contactapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    public List<Contact> getAllContact() {
        return contactRepository.findAll();
    }

    @PostMapping
    public Contact addNewContact(@RequestBody @Valid Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping("/{id}")
    public Optional<Contact> getById(@PathVariable("id") Long Id) {
        return contactRepository.findById(Id);
    }

    @DeleteMapping("/{id}")
    public List<Contact> deleteContact(@PathVariable("id") Long Id) {
        contactRepository.deleteById(Id);
        return contactRepository.findAll();
    }

}
