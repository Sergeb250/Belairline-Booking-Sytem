package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDao {
    private final String DB_URL = "jdbc:postgresql://localhost:5432/belairlines";
    private final String DB_USER = "postgres";
    private final String DB_PASSWORD = "Ange@1998";
    // REGISTER
    public boolean registerUser(User user) {
        String sql = "INSERT INTO users (first_name, last_name, phone_number, address, username, password) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getPhoneNumber());
            stmt.setString(4, user.getAddress());
            stmt.setString(5, user.getUserName());
            stmt.setString(6, user.getPassword());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException e) {
            System.out.println("Registration failed: " + e.getMessage());
            return false;
        }
    }

    // GET ALL USERS
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                User user = new User(
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("phone_number"),
                    rs.getString("address"),
                    rs.getString("username"),
                    rs.getString("password")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Error reading users: " + e.getMessage());
        }
        return users;
    }

    // GET USER BY USERNAME
    public User getUserByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("phone_number"),
                    rs.getString("address"),
                    rs.getString("username"),
                    rs.getString("password")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error fetching user: " + e.getMessage());
        }
        return null;
    }

    // UPDATE USER BY USERNAME
    public boolean updateUser(User user) {
        String sql = "UPDATE users SET first_name = ?, last_name = ?, phone_number = ?, address = ?, password = ? WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getPhoneNumber());
            stmt.setString(4, user.getAddress());
            stmt.setString(5, user.getPassword());
            stmt.setString(6, user.getUserName());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;

        } catch (SQLException e) {
         
            return false;
        }
    }

    // DELETE USER BY USERNAME
    public boolean deleteUser(String username) {
        String sql = "DELETE FROM users WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;

        } catch (SQLException e) {
           
            return false;
        }
    }
    
    
    public boolean usernameExists(String username) {
    boolean exists = false;
     try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM users WHERE username = ?")) {
        
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            exists = rs.getInt(1) > 0;
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // You can log or handle it as needed
    }
    return exists;
}
    
    public boolean verifyLogin(String username, String password) {
    boolean isValid = false;
    String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, username);
        stmt.setString(2, password);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            isValid = true; // Credentials are valid
        }

    } catch (SQLException ex) {
        ex.printStackTrace(); // Consider logging properly
    }

    return isValid;
}


}
