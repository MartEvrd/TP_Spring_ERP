package com.example.tpspringerp.entite;

import java.util.Date;

public class User {

    private String name;
    private String firstName;
    private String email;
    private Date birthDate;

    private Address address;

    public User(String name, String firstName, String email, Date birthDate, Address address) {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.birthDate = birthDate;

        this.address = address;
    }

    public User() {
        this.address = new Address();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate!= null) {this.birthDate = birthDate;}
    }

    public Address getAddress() {
        if (address == null) {return new Address();}
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n -> Name : "+this.name+
                "\n -> First Name : "+this.firstName+
                "\n -> Email : "+this.email+
                "\n -> Birth Date : "+this.birthDate;
    }
}
