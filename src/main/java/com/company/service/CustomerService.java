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
    public CustomerService() throws SQLException, ClassNotFoundException {
        userDAO = new UserDaoImpl();
    }
    @Override
    public void signIn() {

    }
    @Override
    public void signUp(User user) throws SQLException {
        userDAO.insert(user);
    }
    @Override
    public void addToCart() {

    }

    @Override
    public List<Part> findPart(List<Part> parts, String name) {
        return parts.stream()
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
