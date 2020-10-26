package com.company.interfaces;

import com.company.classes.Bus;
import com.company.classes.Passenger;

public interface TicketSystemInterface {
    // Creates a new Bus object and add it to the ArrayList
    void createBus(String departure, String destination);

    // Creates a new Passenger object and add it to the ArrayList
    void createPassenger(String name, String dob, String address);

    // Finds a bus by departure and destination
    Bus findBus(String departure, String destination);

    // Adds Passenger to a specific bus
    void addPassengerToBus(Passenger p, String departure, String destination);

    //Removes passenger from specific bus
    void removePassengerFromBus(Passenger p, String departure, String destination);

    //Delete seat reservation
    void deleteSeatReservation(String side, int row, int seat, String departure, String destination);

    //Checks if there is at least one available seat on the bus
    boolean checkAvailability(String departure, String destination);

    //Finds passenger by name
    PassengerInterface findPassengerByName(String name);

    //Finds Passenger and prints tickets from Passenger
    void printPassengerTickets(String name);

}
