/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

import GUI.WelcomeGUI;
import Implemntation.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ze2reda
 */
public class Main {
     static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        new WelcomeGUI().setVisible(true);
        List<Flight> flights = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        List<Booking> bookings = new ArrayList<>();
        
        //Creating Flights
        Flight flight1 = new Flight("f300","sharam elshak ","cairo","11/5/2023","12/5/2023","B class");
        Flight flight2 = new Flight("A103","LOUXER ","ALEZANRA","13/5/2023","14/5/2023","B class");
        Flight flight3 = new Flight("f10","SOKANA ","CAIRO","17/5/2023","18/5/2023","B class");
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        
        //Creating Passengers
        //Re-arrange the inputs in the consturctor dependet on what u did in class passanger
        Passenger passenger1 = new Passenger("george",15,15,"boja@gamil.com",1544112482); 
        Passenger passenger2 = new Passenger( "BOJA GAAMAL",12,22, "BOJA GAAMAL@gmail.com", 1555);
        Passenger passenger3 = new Passenger( "BOJA GAAMAL",12,22, "BOJA GAAMAL@gmail.com", 1555);
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        
        //Creating Bookings
        //Same issue in constructor inputs
       Booking Booking1 = new Booking("101","george","george@gmail.com","012226485632","a101","cairo","alex",12/3/2023,12/3/2322,"a",5,true,true,52.2,"g66","fish",12,1200.0);
       Booking Booking2 = new Booking("102","ahmed","ahmed @gamil.com","0105548554545","a103","alex","cairo",12/3/2023,12/3/2322,"a",5,"tru","true",52,"dd","stake",60.2,"visa",1600.0);
       Booking Booking3 = new Booking("boja","ddfkfkf","ddddd","dfdtgfrfd","dd","ddd","ffdd","dddd",1/0x3/2023,12/3/2023,"dddd",22,"wwww","ddd",11,4.15,"visa",15550.1)

       bookings.add(Booking1);
        bookings.add(Booking2);
       bookings.add(Booking3); 
        int choice;
        do {
            System.out.println("\nAirline Booking System\n");
            System.out.println("1. Admin Login");
            System.out.println("2. Employee Login");
            System.out.println("3. Book a Flight");
            System.out.println("4. Cancel a Booking");
            System.out.println("5. View Bookings by Passenger");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            input.nextLine(); //consume newline character
            
            switch (choice) {
                case 1 -> {
                    //Admin Login
                    System.out.print("\nEnter username: ");
                    String username = input.nextLine();
                    System.out.print("Enter password: ");
                    String password = input.nextLine();
                    String name = null;
                     int age = 0;       
                    //Same issue put inputs as the required datatypes
                    Admin Admin = new Admin(name,age,username, password);
                    boolean adminLoginStatus = Admin.login(username, password);
                    if (adminLoginStatus) {
                        System.out.println("\nLogin Successful!");
                        System.out.println("Welcome Admin!");
                        //Perform Admin functionalities
                        System.out.println("\nFlights:");
                        for (Flight f : flights) {
                            System.out.println(f);
                        }
                        System.out.println("\nPassengers:");
                        for (Passenger p : passengers) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("\nLogin Failed!"); }
                }

 case 2,    3 ->{ 
     System.out.print("\nEnter username: "); 
 String username = input.nextLine(); 
 System.out.print("Enter password: "); 
 String password = input.nextLine();
 boolean employeeLoginStatus = Employee.login(username, password);  
 if (employeeLoginStatus) { System.out.println("\nLogin Successful!"); 
 System.out.println("Welcome Employee!");
 }                {
     //Book a Flight
     System.out.println("\nAvailable Flights:");
     for (Flight f : flights) {
         System.out.println(f);
     }
     System.out.print("\nEnter Flight Number: ");
     String flightNumber = input.nextLine();
     Flight selectedFlight = null;
     for (Flight f : flights) {
         if (f.getFlightNumber().equals(flightNumber)) {
             selectedFlight = f;
             break;
         }
     }
     if (selectedFlight == null) {
         System.out.println("\nInvalid Flight Number!");
         break;
     }
     System.out.print("Enter Passenger ID: ");
     int passengerId = input.nextInt();
     input.nextLine(); //consume newline character
     Passenger selectedPassenger = null;
     for (Passenger p : passengers) {
         if (p.getPassengerID() == passengerId) {
             selectedPassenger = p;
             break;
         }
     }
     if (selectedPassenger == null) {
         System.out.println("\nPassenger not found!");
         break;
     }
 }
     System.out.print("Enter number of tickets: ");
int numberOfTickets = input.nextInt();
input.nextLine(); // consume newline character
double totalPrice = numberOfTickets * selectedFlight.getTicketPrice;
Booking newBooking = new Booking(bookings.size() + 1, selectedFlight, selectedPassenger, numberOfTickets, totalPrice);
bookings.add(newBooking);
System.out.println("\nBooking Successful!");
System.out.println(newBooking);
                }
case 4 ->       {
    
    System.out.print("\nEnter Booking ID: ");
    int bookingId = input.nextInt();
    input.nextLine(); 
    Booking selectedBooking = null;
    for (Booking b : bookings) {
        if (b.getBookingId() == bookingId) {
            selectedBooking = b;
            break;
        } else {
        }
    }
    if (selectedBooking == null) {
        System.out.println("\nBooking not found!");
        break;
    }
    //isCancelBooikng method is missing
    boolean cancelStatus = selectedBooking.isCancelBooking() 
    if (cancelStatus) {
        System.out.println("\nBooking Cancelled Successfully!");
    } else {
        System.out.println("\nBooking Cancellation Failed!");
    }
                }
            case 5 -> {
                //View Bookings by Passenger
                System.out.print("\nEnter Passenger ID: ");
                int passengerId1 = input.nextInt();
                input.nextLine(); //consume newline character
                List<Booking> passengerBookings = new ArrayList<>();
                for (Booking b : bookings) {
                    if (b.getPassengerName().getPassengerID() == passengerId1) {
                        passengerBookings.add(b);
                    }
                }
                if (passengerBookings.isEmpty()) {
                    System.out.println("\nNo Bookings Found for the Passenger!");
                } else {
                    System.out.println("\nBookings for Passenger " + passengerId1 + ":");
                    for (Booking b : passengerBookings) {
                        System.out.println(b);
                    }
                }
                }
            case 6 -> 
                System.out.println("\nExiting Airline Booking System...");
            default -> System.out.println("\nInvalid Choice! Please Try Again.");
        }
             System.out.print("\nEnter username: ");
             String employeeUsername = input.nextLine();
             System.out.print("Enter password: ");
             String employeePassword = input.nextLine(); 
             Employee employee = new employee(employeeUsername, employeePassword);
             // Login method in employee is missing
             boolean employeeLoginStatus = employee.login(); 
             if (employeeLoginStatus) { System.out.println("\nLogin Successful!");
             System.out.println("Welcome Employee!");
             }
                } while (choice != 6);
    
    input.close();
}
}

