package com.microservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.microservice.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

    private List<Contact> contactList = List.of(
        new Contact(1, "Ravi", "1234567891", 1),
        new Contact(2, "Ram", "1234567523", 1),
        new Contact(3, "Sham", "1234534891", 2),
        new Contact(4, "Rani", "3454567891", 2)
    );

    @Override
    public Contact getContact(int contactId) {
       return contactList.stream().filter(contact -> contact.getContactId() == contactId).findAny().orElse(new Contact());
    }

    @Override
    public List<Contact> getAllContact() {
        return contactList;
    }

    @Override
    public List<Contact> getAllContactOfUser(int userId) {
      return contactList.stream().filter(contact -> contact.getUserId() == userId ).collect(Collectors.toList());
    }
    
}
