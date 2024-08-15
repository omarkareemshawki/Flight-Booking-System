/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;
import java.time.*;
/**
 *
 * @author Ze2reda
 */
public class Luggage extends Booking {
    
private int passengerTicketNum; // refers to which luggage belongs to which passenger
    private int luggageWeight;
    private String luggageCondition; // fragile or not

    public Luggage(int passengerTicketNum, int luggageWeight, String luggageCondition,int bookingId, String passengerName, String passengerEmail, String passengerPhoneNumber, String flightNumber, String departureCity, String arrivalCity, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, String seatClass, int seatNumber, String seatPreference, String mealPreference, int numberOfBags, double totalBaggageWeight, String paymentMethod, double amountPaid) {

        this.passengerTicketNum = passengerTicketNum;
        this.luggageWeight = luggageWeight;
        this.luggageCondition = luggageCondition;
    }

    public void setPassengerTicketNum(int passengerTicketNum) {
        this.passengerTicketNum = passengerTicketNum;
    }

    public int getPassengerTicketNum() {
        return passengerTicketNum;
    }

    public void setLuggageWeight(int luggageWeight) {
        this.luggageWeight = luggageWeight;
    }

    public int getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageCondition(String luggageCondition) {
        this.luggageCondition = luggageCondition;
    }

    public String getLuggageCondition() {
        return luggageCondition;
    }

    public static void main(String[] args) {
    }

    public void addLuggage(int passengerTicketNum, int luggageWeight, String luggageCondition) {
        System.out.println("Luggage " + passengerTicketNum + " has been added to storage.");
    }

    public void removeLuggage(int passengerTicketNum) {
        // remove luggage with the specified passenger ticket number
        // implement this method as per your requirements
        System.out.println("Luggage " + passengerTicketNum + " has been removed from storage.");}
}
