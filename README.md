Absolutely! Here's your improved `README.md` with the actual image links properly embedded so they display the screenshots directly:

---

# ✈️ BelairLine Booking System

The **BelairLine Booking System** is a robust Java Swing desktop application designed to streamline airline ticket booking, management, and customer service operations. Built using the **Model-View-Controller (MVC)** architecture and integrated with **PostgreSQL**, this system provides an efficient platform for both customers and administrators to manage flight reservations with ease.

## 🚀 Features

- 🔐 **User Authentication**
  - Register new accounts
  - Secure login with session-based user identification

- 🧾 **Ticket Booking System**
  - Choose origin, destination, travel date, category, seat, and price
  - Auto-generates ticket ID with "BEL" prefix (hidden from UI)

- 📋 **Booking Dashboard**
  - Admin dashboard for managing bookings
  - View all ticket details

- 🖨️ **Printable Ticket**
  - Generate ticket summaries in a printable format
  - Download or print ticket as a document

- 📂 **Modular Architecture**
  - Clean separation of `Model`, `View`, and `Dao`
  - Easily maintainable and extendable

## 🖼️ Screenshots

### 🏠 Home Page  
![Home Page](https://github.com/Sergeb250/Belairline-Booking-Sytem/blob/92fec46bc6622d69017dc0caf9f241fdd118caea/BelairLines_Images/Screenshot%20(7).png?raw=true)

### 🔐 Login Page  
![Login Page](https://github.com/Sergeb250/Belairline-Booking-Sytem/blob/92fec46bc6622d69017dc0caf9f241fdd118caea/BelairLines_Images/Screenshot%20(2).png?raw=true)

### 📝 Register Page  
![Register Page](https://github.com/Sergeb250/Belairline-Booking-Sytem/blob/99b7954776430eaad10e38583ee8eaedc4435c03/BelairLines_Images/Screenshot%20(8).png?raw=true)

### 🎫 Booking Page  
![Booking Page](https://github.com/Sergeb250/Belairline-Booking-Sytem/blob/99b7954776430eaad10e38583ee8eaedc4435c03/BelairLines_Images/Screenshot%20(3).png?raw=true)

### 📥 Download Ticket Option  
![Download Ticket](https://github.com/Sergeb250/Belairline-Booking-Sytem/blob/99b7954776430eaad10e38583ee8eaedc4435c03/BelairLines_Images/Screenshot%20(4).png?raw=true)

### 📄 Ticket Document  
![Ticket Document](https://github.com/Sergeb250/Belairline-Booking-Sytem/blob/99b7954776430eaad10e38583ee8eaedc4435c03/BelairLines_Images/Screenshot%20(5).png?raw=true)

### 📊 Dashboard  
![Dashboard](https://github.com/Sergeb250/Belairline-Booking-Sytem/blob/99b7954776430eaad10e38583ee8eaedc4435c03/BelairLines_Images/Screenshot%20(6).png?raw=true)

---

## ⚙️ Technologies Used

- **Java Swing** – GUI Development  
- **PostgreSQL** – Database  
- **JDBC** – Database Connectivity  
- **MVC Pattern** – Software Architecture

## 📁 Project Structure

```
Belairline-Booking-System/
│
├── View/         # Swing UI components
├── Model/        # Ticket, User, etc.
├── Dao/          # Database access logic
├── BelairLines_Images/ # Screenshot assets
└── Main.java     # Entry point
```

## 🧪 Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/Sergeb250/Belairline-Booking-Sytem.git
   cd Belairline-Booking-Sytem
   ```

2. **Configure PostgreSQL Database**
   - Create a database named `belairlines`
   - Update the database connection in the DAO classes with:
     ```
     URL: jdbc:postgresql://localhost:5432/belairlines
     User: postgres
     Password:********
     ```

3. **Run the Application**
   - Open the project in your favorite Java IDE (e.g., IntelliJ, NetBeans)
   - Run `Main.java`

---

## 🙌 Author

**Serge B.**  
📧 hacksergeb@gmail.com  
🔗 [GitHub Profile](https://github.com/Sergeb250)

---

