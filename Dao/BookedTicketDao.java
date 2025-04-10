package Dao;
import Dao.TicketDao;

import model.Ticket;
import Model.BookedTicket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookedTicketDao {

    private final String DB_URL = "jdbc:postgresql://localhost:5432/belairlines";
    private final String DB_USER = "postgres";
    private final String DB_PASSWORD = "Ange@1998";

    // Book a ticket for a user
    public boolean bookTicket(String username, String ticketId) {
        String sql = "INSERT INTO BookedTickets(username, ticket_id) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, ticketId);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Fetch all booked tickets joined with user and ticket details
    public List<BookedTicket> getAllBookedTickets() {
        List<BookedTicket> list = new ArrayList<>();

        String sql = " SELECT b.id, u.username, u.phone_number, u.address, " +
                     " t.ticket_id, t.origin, t.destination,t.date,t.price,t.category,t.seat " +
                     " FROM BookedTickets b " +
                     " JOIN Users u ON b.username = u.username " +
                     " JOIN Tickets t ON b.ticket_id = t.ticket_id ";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                BookedTicket bt = new BookedTicket();
                bt.setId(rs.getInt("id"));
                bt.setUsername(rs.getString("username"));
                bt.setPhoneNumber(rs.getString("phone_number"));
                bt.setAddress(rs.getString("address"));
                bt.setTicketId(rs.getString("ticket_id"));
                bt.setOrigin(rs.getString("origin"));
                bt.setDestination(rs.getString("destination"));

                list.add(bt);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
   public List<BookedTicket> getBookedTicketsByUsername(String username) {
    List<BookedTicket> list = new ArrayList<>();

    String sql = "SELECT b.id, u.username, u.phone_number, u.address, " +
                 "t.ticket_id, t.origin, t.destination, t.Date, t.price, t.category, t.seat " +
                 "FROM BookedTickets b " +
                 "JOIN Users u ON b.username = u.username " +
                 "JOIN Tickets t ON b.ticket_id = t.ticket_id " +
                 "WHERE u.username = ?";

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, username);

        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                BookedTicket bt = new BookedTicket();
                bt.setId(rs.getInt("id"));
                bt.setUsername(rs.getString("username"));
                bt.setPhoneNumber(rs.getString("phone_number"));
                bt.setAddress(rs.getString("address"));
                bt.setTicketId(rs.getString("ticket_id"));
                bt.setOrigin(rs.getString("origin"));
                bt.setDestination(rs.getString("destination"));
                
                bt.setDate(rs.getDate("date"));
                bt.setPrice(rs.getDouble("price"));
                bt.setCategory(rs.getString("category"));
                bt.setSeat(rs.getString("seat"));

                list.add(bt);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}
 


}
