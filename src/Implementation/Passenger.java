/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

import java.util.List;

/**
 *
 * @author Ze2reda
 */
public class Passenger extends Person { 

    static void createAccount(List<Passenger> passengers, Passenger newPassenger) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
    private String passengerEmail;
    private int passengerPhoneNumber;
    private int passengerID;

    
    
     
  

    public Passenger(String name, int age , int passengerID, String passengerEmail,int passengerPhoneNumber) {
        
        super(name, age );
        this.passengerID = passengerID;
        this.passengerEmail = passengerEmail;
        this.passengerPhoneNumber = passengerPhoneNumber;
    }

    
    

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public int getPassengerPhoneNumber() {
        return passengerPhoneNumber;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void updatePassenger(Passenger passenger){
        this.name = passenger.name;
        this.passengerEmail = passenger.getPassengerEmail();
        this.passengerPhoneNumber = passenger.getPassengerPhoneNumber();
    }

    public void setPassengerName(String passengerName) {
        this.name = passengerName;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public void setPassengerPhoneNumber(int passengerPhoneNumber) {
        this.passengerPhoneNumber = passengerPhoneNumber;}
    @Override
public String toString() {
    return "Passenger ID: " + this.passengerID + ", Name: " + this.name + ", Email: " + this.passengerEmail + ", Phone Number: " + this.passengerPhoneNumber;
}

public void createAccount(List<Passenger> passengers) {
        passengers.add(this);
        System.out.println("Passenger " + this.getName() + " has been added to the collection.");
    }
 

public void manageAccount(List<Passenger> passengers, int passengerId, String newEmail, int newAge) {
        for (Passenger passenger : passengers) {
            if (passenger.getId() == passengerId) {
                passenger.setEmail(newEmail);
                passenger.setAge(newAge);
                System.out.println("Passenger " + passenger.getName() + " has been updated.");
                return;
            }
        }
        System.out.println("Passenger with ID " + passengerId + " not found."); 
         }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setEmail(String newEmail) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getGender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}