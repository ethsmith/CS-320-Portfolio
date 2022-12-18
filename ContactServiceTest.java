package me.ethsmith.cs320;

import me.ethsmith.cs320.model.Contact;
import me.ethsmith.cs320.service.ContactService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Contact Service Test")
class ContactServiceTest {

    /**
     * Method: addContact(Contact contact)
     */
    @Test
    @DisplayName("Test Add Contact")
    void testAddContact() throws Exception {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contactService.addContact(contact);
        assert(contactService.getContacts().get("1").equals(contact));
    }

    /**
     * Method: removeContact(String id)
     */
    @Test
    @DisplayName("Test Remove Contact")
    void testRemoveContact() throws Exception {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contactService.addContact(contact);
        contactService.removeContact("1");
        assert(contactService.getContacts().get("1") == null);
    }

    /**
     * Method: updateFirstName(String id, String firstName)
     */
    @Test
    @DisplayName("Test Update First Name")
    void testUpdateFirstName() throws Exception {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contactService.addContact(contact);
        contactService.updateFirstName("1", "Jane");
        assert(contactService.getContacts().get("1").getFirstName().equals("Jane"));
    }

    /**
     * Method: updateLastName(String id, String lastName)
     */
    @Test
    @DisplayName("Test Update Last Name")
    void testUpdateLastName() throws Exception {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contactService.addContact(contact);
        contactService.updateLastName("1", "Doe");
        assert(contactService.getContacts().get("1").getLastName().equals("Doe"));
    }

    /**
     * Method: updatePhone(String id, String phone)
     */
    @Test
    @DisplayName("Test Update Phone")
    void testUpdatePhone() throws Exception {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contactService.addContact(contact);
        contactService.updatePhone("1", "0987654321");
        assert(contactService.getContacts().get("1").getPhone().equals("0987654321"));
    }

    /**
     * Method: updateAddress(String id, String address)
     */
    @Test
    @DisplayName("Test Update Address")
    void testUpdateAddress() throws Exception {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contactService.addContact(contact);
        contactService.updateAddress("1", "555 Some Other St");
        assert(contactService.getContacts().get("1").getAddress().equals("555 Some Other St"));
    }
}
