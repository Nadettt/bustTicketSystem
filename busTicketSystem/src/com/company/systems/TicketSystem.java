package com.company.systems;

import com.company.classes.Bus;
import com.company.classes.Passenger;
import com.company.interfaces.PassengerInterface;
import com.company.interfaces.TicketSystemInterface;

import java.util.ArrayList;

public class TicketSystem implements TicketSystemInterface {

    ArrayList<Bus> bus = new ArrayList<Bus>();
    ArrayList<Passenger> passenger = new ArrayList<Passenger>();


    public void createBus(String departure, String destination) {
       Bus newBus = new Bus(departure, destination);
       bus.add(newBus);
    }

    public void createPassenger(String name, String dob, String address) {
        Passenger newPassenger = new Passenger(name, dob, address);
        passenger.add(newPassenger);
    }

    public Bus findBus(String departure, String destination) {
        for (Bus newBus: bus) {
            if (newBus.getDeparture() == departure && newBus.getDestination() == destination)
                return newBus;
        }
        return null;
    }

    public void addPassengerToBus(Passenger p, String departure, String destination) {
        Bus busToFind = findBus(departure, destination);
        if (busToFind != null) {
            busToFind.reserveNextAvailableSeat(p);
        }
    }

    public void removePassengerFromBus(Passenger p, String departure, String destination) {
        Bus busToFind = findBus(departure, destination);
        if (busToFind != null) {
            busToFind.deletePassengerReservation(p);
        }

    }

    public void deleteSeatReservation(String side, int row, int seat, String departure, String destination) {
        Bus busToFind = findBus(departure, destination);
        if (busToFind != null) {
            busToFind.deleteSeatReservation(side, row, seat);
        }
    }

    public boolean checkAvailability(String departure, String destination) {
        Bus busAvailability = findBus(departure, destination);
        if (busAvailability != null) {
            busAvailability.checkIfThereIsAvailableSeat();
        }
        return true;
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger newPassenger: passenger) {
            if (newPassenger.getName() == name)
                return newPassenger;
        }
        return null;
    }

    public void printPassengerTickets(String name) {
        Passenger passengerToFind = findPassengerByName(name);
        if (passengerToFind != null) {
            passengerToFind.getTickets();
        }
    }
}
