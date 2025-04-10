package Dao;

import java.sql.*;
import java.util.*;
import model.Ticket;

public class TicketDao {
    private final String DB_URL = "jdbc:postgresql://localhost:5432/belairlines";
    private final String DB_USER = "postgres";
    private final String DB_PASSWORD = "Ange@1998";

    // Add a ticket
    public boolean addTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (origin, destination, date, price, category, seat) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, ticket.getOrigin());
            stmt.setString(2, ticket.getDestination());
            stmt.setDate(3, ticket.getDate());
            stmt.setDouble(4, ticket.getPrice());
            stmt.setString(5, ticket.getCategory());
            stmt.setString(6, ticket.getSeat());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Add ticket failed: " + e.getMessage());
            return false;
        }
    }

    // Search ticket by ID
    public Ticket searchById(String ticketId) {
        String sql = "SELECT * FROM tickets WHERE ticket_id = ?";
        Ticket ticket = null;

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, ticketId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                ticket = new Ticket();
                ticket.setTicketId(rs.getString("ticket_id"));
                ticket.setOrigin(rs.getString("origin"));
                ticket.setDestination(rs.getString("destination"));
                ticket.setDate(rs.getDate("date"));
                ticket.setPrice(rs.getDouble("price"));
                ticket.setCategory(rs.getString("category"));
                ticket.setSeat(rs.getString("seat"));
            }

        } catch (SQLException e) {
            System.out.println("Search failed: " + e.getMessage());
        }

        return ticket;
    }

    // Read all tickets
    public List<Ticket> readAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String sql = "SELECT * FROM tickets ORDER BY ticket_id";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setTicketId(rs.getString("ticket_id"));
                ticket.setOrigin(rs.getString("origin"));
                ticket.setDestination(rs.getString("destination"));
                ticket.setDate(rs.getDate("date"));
                ticket.setPrice(rs.getDouble("price"));
                ticket.setCategory(rs.getString("category"));
                ticket.setSeat(rs.getString("seat"));

                tickets.add(ticket);
            }

        } catch (SQLException e) {
            System.out.println("Read all tickets failed: " + e.getMessage());
        }

        return tickets;
    }

    // Delete ticket by ID
    public boolean deleteTicketById(String ticketId) {
        String sql = "DELETE FROM tickets WHERE ticket_id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, ticketId);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Delete ticket failed: " + e.getMessage());
            return false;
        }
    }
    
    public boolean updateTicket(Ticket ticket) {
    String sql = "UPDATE tickets SET origin = ?, destination = ?, date = ?, price = ?, category = ?, seat = ? WHERE ticket_id = ?";

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, ticket.getOrigin());
        stmt.setString(2, ticket.getDestination());
        stmt.setDate(3, ticket.getDate());
        stmt.setDouble(4, ticket.getPrice());
        stmt.setString(5, ticket.getCategory());
        stmt.setString(6, ticket.getSeat());
        stmt.setString(7, ticket.getTicketId()); // Use the ticket ID for updating

        return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error updating ticket: " + e.getMessage());
        return false;
    }
}
    
    public List<Ticket> searchTickets(String origin, String destination, String category) {
    List<Ticket> tickets = new ArrayList<>();
    String sql = "SELECT * FROM tickets WHERE origin = ? AND destination = ? AND category = ?";

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, origin);
        stmt.setString(2, destination);
        stmt.setString(3, category);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Ticket ticket = new Ticket();
            ticket.setTicketId(rs.getString("ticket_id"));
            ticket.setOrigin(rs.getString("origin"));
            ticket.setDestination(rs.getString("destination"));
            ticket.setDate(rs.getDate("date"));
            ticket.setPrice(rs.getDouble("price"));
            ticket.setCategory(rs.getString("category"));
            ticket.setSeat(rs.getString("seat"));

            tickets.add(ticket);
        }

    } catch (SQLException e) {
        System.out.println("Search failed: " + e.getMessage());
    }

    return tickets;
}


}

