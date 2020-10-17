package com.company.model.users;

import com.company.exceptions.InvalidDataException;
import com.company.model.parts.Part;

import java.util.ArrayList;
import java.util.List;

abstract public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String number;
    private UserType userType;
    private List<Part> cart;

    public User(int id, String name, String surname, String email, String password, String number, UserType userType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.number = number;
        this.userType = userType;
        cart = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        try {
            this.id = id;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        try {
            this.name = name;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        try {
            this.surname = surname;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        try {
            this.email = email;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        try {
            this.password = password;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        try {
            this.number = number;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
    public UserType getPersonType() {
        return userType;
    }
    public void setPersonType(UserType userType) {
        try {
            this.userType = userType;
        } catch (InvalidDataException e) {
            e.toString();
        }
    }
}
