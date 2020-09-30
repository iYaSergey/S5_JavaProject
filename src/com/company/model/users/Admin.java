package com.company.model.users;

public class Admin extends User {
    public Admin(int id, String name, String surname, String email, String password, String number) {
        super(id, name, surname, email, password, number, UserType.Admin);
    }
}
