package model;

public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String userName;
    private String password;

    public User(String firstName, String lastName, String phoneNumber, String address, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }

    public User() {
       //To change body of generated methods, choose Tools | Templates.
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getUserName() { return userName; }
    public String getPassword() { return password; }

    // Setters (optional)
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAddress(String address) { this.address = address; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setPassword(String password) { this.password = password; }
}
