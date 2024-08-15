/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

import java.time.LocalDateTime; 
import java.util.ArrayList; 
import java.util.List;
/**
 *
 * @author UWU
 */
 
public class Booking {    
 
    private static int nextBookingId = 1;
    private final int bookingId;
    private final String passengerName;
    private final String passengerEmail;
    private final String
passengerPhoneNumber;
    private final String flightNumber;
    private final String origin;
    private final String destination;
    private final String departureCity;
    private final String arrivalCity;
    private final LocalDateTime departureDateTime;
    private final LocalDateTime arrivalDateTime;
    private final String seatClass;
    private final int seatNumber;
    private boolean isConfirmed;
    private boolean isCheckedIn;
    private double totalPrice;
    private final String seatPreference;
    private final String mealPreference;
    private final int numberOfBags;
    private final double totalBaggageWeight;
    private boolean isCancelled;
    private final String paymentMethod;
    private final double amountPaid;

    public Booking(String passengerName, String passengerEmail, String passengerPhoneNumber,
                   String flightNumber,String origin,String destination,String departureCity, String arrivalCity,
                   LocalDateTime departureDateTime, LocalDateTime arrivalDateTime,
                   String seatClass, int seatNumber, String seatPreference, String mealPreference,
                   int numberOfBags, double totalBaggageWeight, String paymentMethod, double amountPaid) {
        this.bookingId = nextBookingId++;
        this.passengerName = passengerName;
        this.passengerEmail = passengerEmail;
        this.passengerPhoneNumber = passengerPhoneNumber;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
        this.seatPreference = seatPreference;
        this.mealPreference = mealPreference;
        this.numberOfBags = numberOfBags;
        this.totalBaggageWeight = totalBaggageWeight;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
        this.isConfirmed = false;
        this.isCheckedIn = false;
        this.isCancelled = false;
    }

    Booking() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public String getPassengerPhoneNumber() {
        return passengerPhoneNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
public boolean isConfirmed() {
        return isConfirmed;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public String getMealPreference() {
        return mealPreference;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public double getTotalBaggageWeight() {
        return totalBaggageWeight;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmountPaid() {
 return amountPaid;
}
public void confirmBooking() {
    this.isConfirmed = true;
    calculateTotalPrice();
}



public void checkIn() {
    this.isCheckedIn = true;
}
public void bookTicket(String passengerName, String passengerEmail, String passengerPhoneNumber,
                       String origin, String destination, LocalDateTime departureTime, String seatClass,
                       int numSeats, String seatPreference, String mealPreference, int numberOfBags,
                       double totalBaggageWeight, String paymentMethod, double amountPaid) {
    List<flight> availableFlights = searchFlights(origin, destination, departureTime); //searchflight can be called different at mohamed's class 

    if (availableFlights.isEmpty()) {
        System.out.println("No flights available for the given route and time.");
        return;
    }

    for (flight flight : availableFlights) {
        if (flight.getSeatClassAvailability(seatClass) >= numSeats) {
            List<Integer> availableSeatNumbers = flight.getAvailableSeatNumbers(seatClass);
            if (availableSeatNumbers.size() >= numSeats) {
                List<Integer> selectedSeatNumbers = new ArrayList<>();
                for (int i = 0; i < numSeats; i++) {
                    selectedSeatNumbers.add(availableSeatNumbers.get(i));
                }
                double totalPrice = numSeats * flight.getPrice(seatClass);
                Booking booking = new Booking(passengerName, passengerEmail, passengerPhoneNumber,
                        flight.getFlightNumber(), origin, destination, flight.getDepartureCity(), flight.getArrivalCity(),
                        flight.getDepartureTime(), flight.getArrivalTime(), seatClass, selectedSeatNumbers,
                        seatPreference, mealPreference, numberOfBags, totalBaggageWeight, paymentMethod, amountPaid);
                booked.add(booking); // a database is needed to add new bookings
                flight.reserveSeats(seatClass, selectedSeatNumbers);
                System.out.println("Booking confirmed. Your booking ID is " + booking.getBookingId());
                return;
            }
        }
    }
    System.out.println("Not enough seats available for the given class of service.");
}


public void cancelBooking() {
    if (!isCancelled) {
        isCancelled = true;
        flight flight = flightDatabase.getFlightByFlightNumber(flightNumber);
        if (flight != null) {
            if (seatNumber != 0) {
                flight.freeSeat(seatClass, seatNumber);
            } else {
                flight.freeSeats(seatClass, selectedSeatNumbers);
            }
        }
    }
}

public void updateBooking(String passengerName, String passengerEmail, String passengerPhoneNumber,
                   String seatPreference, String mealPreference,
                   int numberOfBags, double totalBaggageWeight, String paymentMethod, double amountPaid) {
        if (isCancelled) {
            throw new IllegalStateException("Cannot update a cancelled booking.");
        }

        calculateTotalPrice();
}



private void calculateTotalPrice() {
    double basePrice = 0.0;
    if (seatClass.equals("Economy")) {
        basePrice = 100.0;
    } else if (seatClass.equals("Business")) {
        basePrice = 200.0;
    } else if (seatClass.equals("First Class")) {
        basePrice = 300.0;
    }

    double baggagePrice = 0.0;
    if (numberOfBags > 0) {
        if (totalBaggageWeight <= 10) {
            baggagePrice = 20.0;
        } else if (totalBaggageWeight <= 20) {
            baggagePrice = 40.0;
        } else if (totalBaggageWeight <= 30) {
            baggagePrice = 60.0;
        }
    }

    double totalPrice = basePrice + baggagePrice;
    this.totalPrice = totalPrice;

    if (paymentMethod.equals("Credit Card")) {
        this.totalPrice *= 1.05;
    } else if (paymentMethod.equals("PayPal")) {
        this.totalPrice *= 1.03;
    }
    if (amountPaid < totalPrice) {
        throw new IllegalArgumentException("Amount paid is less than the total price");}
}
}