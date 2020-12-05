package com.company.service;

import com.company.dao.UserDaoImpl;
import com.company.model.parts.Part;
import com.company.model.parts.PartType;
import com.company.model.users.User;
import com.company.service.interfaces.ShopServiceInterface;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerService implements ShopServiceInterface {
    private UserDaoImpl userDAO;
    public CustomerService() {
        try {
            userDAO = new UserDaoImpl();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void signIn() {

    }
    @Override
    public void signUp(User user) {
        userDAO.insert(user);
    }
    @Override
    public void addToCart() {

    }

    @Override
    public List<Part> findPart(Map<PartType, Part> parts, String name) {
        return parts.values().stream()
                .filter(o -> name.equals(o.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteFromCart() {

    }
    @Override
    public void buy() {

    }

}
