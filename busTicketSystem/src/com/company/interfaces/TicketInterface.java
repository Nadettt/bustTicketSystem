package com.company.interfaces;

public interface TicketInterface {
    //Returns the ticket holder’s name
    String getTicketHolder();

    //Assigns the ticket holder’s name
    void setTicketHolder(String ticketHolder);

    //Returns the date of departure
    String getDate();

    //Assigns the date of departure
    void setDate(String date);

    //Returns the place of departure
    String getDeparture();

    //Assigns the place of departure
    void setDeparture(String departure);

    //Returns the destination
    String getDestination();

    //Assigns the destination
    public void setDestination(String destination);

    //Overrides the default toString function and returns a nicely formatted String with information about the ticket
    @Override
    public String toString();

}
