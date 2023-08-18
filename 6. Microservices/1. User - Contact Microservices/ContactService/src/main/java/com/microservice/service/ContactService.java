package com.microservice.service;

import java.util.List;

import com.microservice.entity.Contact;

public interface ContactService {

    public Contact getContact(int contactId);
    public List<Contact> getAllContact();
    public List<Contact> getAllContactOfUser(int userId);

}
