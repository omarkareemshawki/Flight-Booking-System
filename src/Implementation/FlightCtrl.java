/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

import Implementation.Flight;
import Implementation.FlightDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightCtrl {
    FlightDAO flightDAO=new FlightDAO();
    List<Flight> flights = new ArrayList<>();

    boolean AddFlight(String flightNumber, String departureCity, String arrivalCity, String departureTime, String arrivalTime, String flightCategory) throws IOException {
       Flight flight = new Flight(flightNumber,departureCity,arrivalCity,departureTime,arrivalTime,flightCategory);
        if (flightDAO.addFlight(flight)){
           return true;
       }else return false;
    }
    boolean DeleteFlight(int Number){
        try {
            flightDAO.deleteFlight(String.valueOf(Number));
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    boolean Update(String flightNumber,String departureTime, String arrivalTime, String flightCategory) throws IOException {
        boolean result;
        Flight flight = flightDAO.find(flightNumber);
        if (flight != null) {
            flight.setDepartureTime(departureTime);
            flight.setFlightCategory(flightCategory);
            flight.setArrivalTime(arrivalTime);
            flightDAO.updateFlight(flight);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    List<String> GnerateReport() throws IOException {
        List<String> fli = new ArrayList<>();
        flights = flightDAO.getAllFlights();
        for (int i=0; i>flights.size();i++) {
            Flight flight=flights.get(i);
            String fly= flight.toString();
            fli.add(fly);
        }return fli;
    }

    public Flight find(String flightNumber) throws IOException {
        Flight flight = flightDAO.find(flightNumber);
        if (flight!=null){
         return flight;
        }
        else return null;
    }

    public List<Flight> getAllFlights() throws IOException {
       List<Flight>flights = flightDAO.getAllFlights();
       return flights;
    }
}
