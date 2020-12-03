package com.company.service;

import com.company.model.parts.Part;
import com.company.model.parts.PartType;
import com.company.model.users.User;
import com.company.service.interfaces.ShopServiceInterface;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class AdminService implements ShopServiceInterface {
    @Override
    public void signIn() {

    }
    @Override
    public void signUp(User user) throws SQLException {

    }
    @Override
    public void addToCart() {

    }

    @Override
    public List<Part> findPart(Map<PartType, Part> parts, String name) {
        return null;
    }

    @Override
    public void deleteFromCart() {

    }
    @Override
    public void buy() {

    }
    public void deleteUser() {}
}
