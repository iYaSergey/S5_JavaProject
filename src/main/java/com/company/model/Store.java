package com.company.model;

import com.company.model.parts.Part;
import com.company.model.users.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
    public void addParts(List<Part> parts) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //executor.invokeAll(...)
        executor.submit(() -> parts.forEach(part -> this.parts.add(part)));
        executor.shutdown();
    }

    public static Store deserialize() {
        Store store = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/store.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            store = (Store) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        return store;
    }
    public void serialize() {
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/store.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
