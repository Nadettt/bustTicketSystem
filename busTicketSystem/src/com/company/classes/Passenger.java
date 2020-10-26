package com.company.classes;

import com.company.interfaces.PassengerInterface;
import java.util.ArrayList;

public class Passenger implements PassengerInterface {

    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    public String name;
    public String dob;
    public String address;

    public Passenger(String name, String dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        this.dob = getDob();
        return dob;
    }

    public String getAddress() {
        this.address = getAddress();
        return address;
    }

    public void createTicket(String date, String departure, String destination) {
        tickets.add(new Ticket(this.name, date, departure, destination));
    }

    @Override
    public String toString() {
        return "Passenger" + name + "/n" +
                "born on " + dob + "/n" +
                "and address " + address + "/n" +
                "is the holder of ticket " + tickets;
    }
}
