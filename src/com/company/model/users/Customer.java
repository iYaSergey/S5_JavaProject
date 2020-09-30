package com.company.model.users;

public class Customer extends User {
    public Customer(int id, String name, String surname, String email, String password, String number) {
        super(id, name, surname, email, password, number, UserType.Customer);
    }
}
