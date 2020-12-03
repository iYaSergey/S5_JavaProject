package com.company.dao;

import com.company.model.users.User;
import com.company.model.users.UserType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final Connection connection;

    public UserDaoImpl() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/techstoredb?serverTimezone=UTC", "root", "q1w2e3AsD");
    }

    @Override
    public boolean insert(User user) {
        String sql = "INSERT INTO techstoredb.users (name, surname, email, password, number, user_type) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getName());
            ps.setString(2, user.getSurname());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getNumber());
            ps.setString(6, user.getUserType().toString());
            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                user.setId((int)generatedKeys.getLong(1));
            }
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public User findById(int id) {
        String sql = "SELECT * FROM techstoredb.users WHERE id = ?";
        User user;
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, String.valueOf(id));
            ResultSet rs = ps.executeQuery();
            rs.next();
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String email = rs.getString("email");
            String password = rs.getString("password");
            String number = rs.getString("number");
            UserType userType = UserType.valueOf(rs.getString("user_type"));
            user = new User(id, name, surname, email, password, number, userType);
        } catch (SQLException e) {
            return null;
        }
        return user;
    }

    @Override
    public List<User> findByType(UserType userType) {
        String sql = "SELECT * FROM techstoredb.users WHERE user_type = ?";
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, String.valueOf(userType));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users.add(new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("number"),
                        userType));
            }
        } catch (SQLException e) {
            return null;
        }
        return users;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM techstoredb.users";
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users.add(new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("number"),
                        UserType.valueOf(rs.getString("user_type"))));
            }
        } catch (SQLException e) {
            return null;
        }
        return users;
    }

    @Override
    public boolean update(User user) {
        String sql = "UPDATE techstoredb.users " +
                "SET name = ?, surname = ?, email = ?, password = ?, number = ?, user_type = ? " +
                "WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getSurname());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getNumber());
            ps.setString(6, user.getUserType().toString());
            ps.setInt(7, user.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(User user) {
        String sql = "DELETE FROM techstoredb.users WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
}
