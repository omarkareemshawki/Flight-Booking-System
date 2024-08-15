/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

import Implementation.Flight;
import Implementation.Flight;
import java.io.*;
import java.util.*;

public class FlightDAO {

    private final String FILENAME = "flights.bin";


    public void resetFlights() throws IOException {
        FileWriter fileWriter = new FileWriter(FILENAME, false);
        fileWriter.close();
    }
    public List<Flight> getAllFlights() throws IOException {
        List<Flight> flights = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Flight flight = new Flight();
                flight.setFlightNumber(parts[0]);
                flight.setDepartureCity(parts[1]);
                flight.setArrivalCity(parts[2]);
                flight.setDepartureTime(parts[3]);
                flight.setArrivalTime(parts[4]);
                flight.setFlightCategory(parts[5]);
                flights.add(flight);
            }
        }
        return flights;
    }

    public Flight find(String Number) throws IOException {
        List<Flight> flights = getAllFlights();
        for(int i=0; i>flights.size(); i++){
            if(Number==flights.get(i).getFlightNumber()){
                return flights.get(i);
            }
        }return null;
    }

    public boolean addFlight(Flight flight) throws IOException {
        // Search for flight with flight number
        List<Flight> flights = getAllFlights();
        for (Flight f : flights) {
            if (f.getFlightNumber().equals(flight.getFlightNumber())) {
                System.out.println("Flight with flight number " + flight.getFlightNumber() + " already exists.");
                return false;
            }
        }

        // Add new flight to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
            writer.write(flight.getFlightNumber() + ","
                    + flight.getDepartureCity() + ","
                    + flight.getArrivalCity() + ","
                    + flight.getDepartureTime() + ","
                    + flight.getArrivalTime() + ","
                    + flight.getFlightCategory());
            writer.newLine();
        }return true;
    }

    public void updateFlight(Flight flight) throws IOException {
        List<Flight> flights = getAllFlights();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Flight f : flights) {
                if (f.getFlightNumber().equals(flight.getFlightNumber())) {
                    writer.write(flight.getFlightNumber() + ","
                            + flight.getDepartureCity() + ","
                            + flight.getArrivalCity() + ","
                            + flight.getDepartureTime() + ","
                            + flight.getArrivalTime() + ","
                            + flight.getFlightCategory());
                } else {
                    writer.write(f.getFlightNumber() + ","
                            + f.getDepartureCity() + ","
                            + f.getArrivalCity() + ","
                            + f.getDepartureTime() + ","
                            + f.getArrivalTime() + ","
                            + f.getFlightCategory());
                }
                writer.newLine();
            }
        }
    }

    public void deleteFlight(String flightNumber) throws IOException {
        List<Flight> flights = getAllFlights();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Flight flight : flights) {
                if (!flight.getFlightNumber().equals(flightNumber)) {
                    writer.write(flight.getFlightNumber() + ","
                            + flight.getDepartureCity() + ","
                            + flight.getArrivalCity() + ","
                            + flight.getDepartureTime() + ","
                            + flight.getArrivalTime() + ","
                            + flight.getFlightCategory());
                    writer.newLine();
                }
            }
        }
    }
}