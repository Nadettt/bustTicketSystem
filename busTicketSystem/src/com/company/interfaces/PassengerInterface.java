package com.company.interfaces;

import com.company.classes.Ticket;
import java.util.ArrayList;

public interface PassengerInterface {
    //Returns the tickets
    ArrayList<Ticket> getTickets();

    //Returns the name
    String getName();

    //Returns the date of birth
    String getDob();

    //Returns the address
    String getAddress();

    //Create a new Ticket and add it to the ArrayList
    void createTicket(String date, String departure, String destination);

    //Override the original toString function and represent the Passenger object with nicely formatted information about him/her instead
    @Override
    String toString();

}
