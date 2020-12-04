package com.company.service.interfaces;

import com.company.model.parts.Part;
import com.company.model.parts.PartType;
import com.company.model.users.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ShopServiceInterface {
    void signIn();
    void signUp(User user) throws SQLException;
    void addToCart();
    List<Part> findPart(List<Part> parts, String name);
    void deleteFromCart();
    void buy();
}
