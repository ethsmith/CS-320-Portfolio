package me.ethsmith.cs320.service;

import me.ethsmith.cs320.model.Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

    private final Map<String, Contact> contacts = new HashMap<>();

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
    }

    public void removeContact(String id) {
        contacts.remove(id);
    }

    public void updateFirstName(String id, String firstName) {
        Contact contact = contacts.get(id);

        if (contact == null) {
            throw new IllegalArgumentException("No contact with id " + id);
        }

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("firstName must be non-null and no longer than 10 characters");
        }

        contact.setFirstName(firstName);
    }

    public void updateLastName(String id, String lastName) {
        Contact contact = contacts.get(id);

        if (contact == null) {
            throw new IllegalArgumentException("No contact with id " + id);
        }

        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("lastName must be non-null and no longer than 10 characters");
        }


        contact.setLastName(lastName);
    }

    public void updatePhone(String id, String phone) {
        Contact contact = contacts.get(id);

        if (contact == null) {
            throw new IllegalArgumentException("No contact with id " + id);
        }

        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("phone must be non-null and be exactly 10 characters");
        }

        contact.setPhone(phone);
    }

    public void updateAddress(String id, String address) {
        Contact contact = contacts.get(id);

        if (contact == null) {
            throw new IllegalArgumentException("No contact with id " + id);
        }

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("address must be non-null and no longer than 30 characters");
        }

        contact.setAddress(address);
    }
}
