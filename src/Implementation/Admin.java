package Implementation;

import java.util.ArrayList;

public class Admin extends Person {
    private String[] Usernames = {"Boja", "Amjad", "Ahmed"};
    private String[] Passwords = {"boja123", "amjad123", "ahmed123"};
    
    private String username;
    private String password;
    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;

    public Admin(String name, int age, String username, String password) {
        super(name, age);
        this.username = username;
        this.password = password;
        this.flights = new ArrayList<Flight>();
        this.bookings = new ArrayList<Booking>();
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addFlight(String flightNumber, String departureCity, String arrivalCity, String departureTime, String arrivalTime) {
        try {
            Flight newFlight = new Flight(flightNumber, departureCity, arrivalCity, departureTime, arrivalTime);
            this.flights.add(newFlight);
            System.out.println("Flight " + flightNumber + " has been added.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeFlight(String flightNumber) {
        try {
            Flight flightToRemove = null;
            for (Flight flight : this.flights) {
                if (flight.getFlightNumber().equals(flightNumber)) {
                    flightToRemove = flight;
                    break;
                }
            }
            if (flightToRemove != null) {
                this.flights.remove(flightToRemove);
                System.out.println("Flight " + flightNumber + " has been removed.");
            } else {
                throw new IllegalArgumentException("Flight " + flightNumber + " could not be found.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateFlight(String flightNumber, String departureCity, String arrivalCity, String departureTime, String arrivalTime) {
        try {
            Flight flightToUpdate = null;
            for (Flight flight : this.flights) {
                if (flight.getFlightNumber().equals(flightNumber)) {
                    flightToUpdate = flight;
                    break;
                }
            }
            if (flightToUpdate != null) {
                flightToUpdate.setDepartureCity(departureCity);
                flightToUpdate.setArrivalCity(arrivalCity);
                flightToUpdate.setDepartureTime(departureTime);
                flightToUpdate.setArrivalTime(arrivalTime);
                System.out.println("Flight " + flightNumber + " has been updated.");
            } else {
                System.out.println("Flight " + flightNumber + " could not be found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while updating flight " + flightNumber + ": " + e.getMessage());
        }
    }

    public void addBooking(Booking booking) {
        try {
            this.bookings.add(booking);
            System.out.println("Booking has been added.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeBooking(Booking booking) {
        try {
            if (this.bookings.contains(booking)) {
                this.bookings.remove(booking);
                System.out.println("Booking has been removed.");
            } else {
                throw new IllegalArgumentException("Booking could not be found.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void generateReports(String departureCity, String arrivalCity) {
    double totalFare = 0;
    int numBookings = 0;
    for (Booking booking : this.bookings) {
        int flight = booking.getBookingId();
//        if (booking.getFlightNumber().equals(flight) && booking.getFlightNumber().getDepartureCity().equals(departureCity) && booking.getFlightNumber().getArrivalCity().equals(arrivalCity)) {
//            numBookings++;
//        }
    }
    System.out.println("Total bookings for " + departureCity + " to " + arrivalCity + ": " + numBookings);
    System.out.println("Total fare collected for " + departureCity + " to " + arrivalCity + ": $" + totalFare);
}

    public boolean login(String enteredUsername, String enteredPassword) {
        for (int i = 0; i < this.Usernames.length; i++) {
            if (enteredUsername.equals(this.Usernames[i]) && enteredPassword.equals(this.Passwords[i])) {
                return true;
            }
        }
        return false;
    }
}
