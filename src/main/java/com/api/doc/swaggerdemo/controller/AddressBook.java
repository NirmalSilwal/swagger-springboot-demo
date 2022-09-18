package com.api.doc.swaggerdemo.controller;

import com.api.doc.swaggerdemo.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/v1/api")
public class AddressBook {

    // to store data
    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id) {
        return contacts.get(id);
    }

    @GetMapping("/")
    public List<Contact> getAllContacts() {
        return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;
    }


}
