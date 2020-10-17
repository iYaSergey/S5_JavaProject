package com.company.model.users;

public class Vendor extends User {
    public Vendor(int id, String name, String surname, String email, String password, String number) {
        super(id, name, surname, email, password, number, UserType.Vendor);
    }
}
