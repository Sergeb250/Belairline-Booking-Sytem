package model;

import java.sql.Date;

public class Ticket {
    private String ticketId;
    private String origin;
    private String destination;
    private Date date;
    private double price;
    private String category;
    private String seat;

    // Getters and Setters
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }

   
}

