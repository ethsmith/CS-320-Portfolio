package me.ethsmith.cs320;

import me.ethsmith.cs320.model.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Contact Test")
class ContactTest {

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor")
    void testContactConstructor() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        assert(contact.getId().equals("1"));
        assert(contact.getFirstName().equals("John"));
        assert(contact.getLastName().equals("Smith"));
        assert(contact.getPhone().equals("1234567890"));
        assert(contact.getAddress().equals("555 Nunya St"));
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Null Id")
    void testContactConstructorWithNullId() throws Exception {
        try {
            Contact contact = new Contact(null, "John", "Smith", "1234567890", "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Id Too Long")
    void testContactConstructorWithIdTooLong() throws Exception {
        try {
            Contact contact = new Contact("12345678901", "John", "Smith", "1234567890", "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Null First Name")
    void testContactConstructorWithNullFirstName() throws Exception {
        try {
            Contact contact = new Contact("1", null, "Smith", "1234567890", "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With First Name Too Long")
    void testContactConstructorWithFirstNameTooLong() throws Exception {
        try {
            Contact contact = new Contact("1", "12345678901", "Smith", "1234567890", "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Null Last Name")
    void testContactConstructorWithNullLastName() throws Exception {
        try {
            Contact contact = new Contact("1", "John", null, "1234567890", "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Last Name Too Long")
    void testContactConstructorWithLastNameTooLong() throws Exception {
        try {
            Contact contact = new Contact("1", "John", "12345678901", "1234567890", "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Null Phone")
    void testContactConstructorWithNullPhone() throws Exception {
        try {
            Contact contact = new Contact("1", "John", "Smith", null, "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Phone Too Long")
    void testContactConstructorWithPhoneTooLong() throws Exception {
        try {
            Contact contact = new Contact("1", "John", "Smith", "12345678901", "555 Nunya St");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Null Address")
    void testContactConstructorWithNullAddress() throws Exception {
        try {
            Contact contact = new Contact("1", "John", "Smith", "1234567890", null);
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }

    /**
     * Method: Contact(String id, String firstName, String lastName, String phone, String address)
     */
    @Test
    @DisplayName("Test Contact Constructor With Address Too Long")
    void testContactConstructorWithAddressTooLong() throws Exception {
        try {
            Contact contact = new Contact("1", "John", "Smith", "1234567890", "1234567891123456789222345678933");
            assert(false);
        } catch (IllegalArgumentException e) {
            assert(true);
        }
    }


    /**
     * Method: getId()
     */
    @Test
    @DisplayName("Test Get Id")
    void testGetId() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        assert(contact.getId().equals("1"));
    }

    /**
     * Method: getFirstName()
     */
    @Test
    @DisplayName("Test Get First Name")
    void testGetFirstName() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        assert(contact.getFirstName().equals("John"));
    }

    /**
     * Method: setFirstName(String firstName)
     */
    @Test
    @DisplayName("Test Set First Name")
    void testSetFirstName() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contact.setFirstName("Jane");
        assert(contact.getFirstName().equals("Jane"));
    }

    /**
     * Method: getLastName()
     */
    @Test
    @DisplayName("Test Get Last Name")
    void testGetLastName() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        assert(contact.getLastName().equals("Smith"));
    }

    /**
     * Method: setLastName(String lastName)
     */
    @Test
    @DisplayName("Test Set Last Name")
    void testSetLastName() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contact.setLastName("Doe");
        assert(contact.getLastName().equals("Doe"));
    }

    /**
     * Method: getPhone()
     */
    @Test
    @DisplayName("Test Get Phone")
    void testGetPhone() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        assert(contact.getPhone().equals("1234567890"));
    }

    /**
     * Method: setPhone(String phone)
     */
    @Test
    @DisplayName("Test Set Phone")
    void testSetPhone() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contact.setPhone("0987654321");
        assert(contact.getPhone().equals("0987654321"));
    }

    /**
     * Method: getAddress()
     */
    @Test
    @DisplayName("Test Get Address")
    void testGetAddress() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        assert(contact.getAddress().equals("555 Nunya St"));
    }

    /**
     * Method: setAddress(String address)
     */
    @Test
    @DisplayName("Test Set Address")
    void testSetAddress() throws Exception {
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "555 Nunya St");
        contact.setAddress("556 Nunya St");
        assert(contact.getAddress().equals("556 Nunya St"));
    }
}
