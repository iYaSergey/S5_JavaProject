package com.company;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;
import com.company.model.Store;
import com.company.model.parts.CPU.CPU;
import com.company.model.parts.CPU.CPUSocket;
import com.company.model.parts.CPU.CPUType;
import com.company.model.parts.Part;
import com.company.model.users.User;
import com.company.model.users.UserType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Store store = Store.deserialize();
        if (store == null) store = new Store();

        List<Part> parts = new ArrayList<>();
        parts.add(new CPU(1, "something", "smth",
                10, 10, 10, 10, true, 10, 10, true, true,
                CPUSocket.AM2, CPUType.Desktop));
        parts.add(new CPU(2, "asd", "smth",
                10, 10, 10, 10, true, 10, 10, true, true,
                CPUSocket.AM2, CPUType.Desktop));
        parts.add(new CPU(3, "dasdfg", "smth",
                10, 10, 10, 10, true, 10, 10, true, true,
                CPUSocket.AM2, CPUType.Desktop));
        parts.add(new CPU(4, "asdfah", "smth",
                10, 10, 10, 10, true, 10, 10, true, true,
                CPUSocket.AM2, CPUType.Desktop));
        store.addParts(parts);

        UserDao userDao = null;
        try {
            userDao = new UserDaoImpl();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        User admin = new User(0, "Vasya", "Pupkin", "a@b.cd", "1234", "1231231", UserType.Admin);
        userDao.insert(admin);


        System.out.println(store.toString());

        store.serialize();
    }
}
