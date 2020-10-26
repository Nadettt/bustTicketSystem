package com.company.interfaces;

import com.company.classes.Passenger;

public interface BusInterface {

    //Check if there is available seat on the bus, return true / false
    boolean checkIfThereIsAvailableSeat();

    //Reserve the next available seat by placing Passenger p in one of the two arrays
    void reserveNextAvailableSeat(Passenger p);

    //Delete seat reservation based on the place on the bus
    void deleteSeatReservation(String side, int row, int seat);

    //Check if Passenger is on bus, if yes delete
    void deletePassengerReservation(Passenger p);

    @Override
    String toString();

    //Returns the place of departure
    String getDeparture();

    //Returns the destination
    String getDestination();


}
