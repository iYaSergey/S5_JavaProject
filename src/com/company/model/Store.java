package com.company.model;

import com.company.model.parts.Part;
import com.company.model.users.User;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Part> parts;
    private List<User> users;

    public Store() {
        parts = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void add(Part part) {
        parts.add(part);
    }
    public void add(User user) {
        users.add(user);
    }
}
