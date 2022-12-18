package me.ethsmith.cs320.model;

public class Contact {

    private final String id;

    private String firstName;

    private String lastName;

    private String phone;

    private String address;

    public Contact(String id, String firstName, String lastName, String phone, String address) {

        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("id must be non-null and no longer than 10 characters");
        }

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("firstName must be non-null and no longer than 10 characters");
        }

        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("lastName must be non-null and no longer than 10 characters");
        }

        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("phone must be non-null and be exactly 10 characters");
        }

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("address must be non-null and no longer than 30 characters");
        }

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
