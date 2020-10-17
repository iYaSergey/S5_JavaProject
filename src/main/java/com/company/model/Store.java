package com.company.model;

import com.company.model.parts.Part;
import com.company.model.parts.PartType;
import com.company.model.users.User;
import com.company.model.users.UserType;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private Map<PartType, Part> parts;
    private Map<UserType, User> users;

    public Store() {
        parts = new HashMap<>();
        users = new HashMap<>();
    }

    public void add(PartType type, Part part) {
        parts.put(type, part);
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
