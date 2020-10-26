package com.company.classes;

import com.company.interfaces.TicketInterface;


public class Ticket implements TicketInterface {

    private static int ticketSerialNumber = 0;

    private String ticketHolder;
    private String date;
    private String departure;
    private String destination;

    public Ticket(String ticketHolder, String date, String departure, String destination) {
        this.ticketHolder = ticketHolder;
        this.date = date;
        this.departure = departure;
        this.destination = destination;
    }

    public static void setTicketSerialNumber(int ticketSerialNumber) {
        Ticket.ticketSerialNumber = ticketSerialNumber++;
    }

    public String getTicketHolder(){
        return ticketHolder;
    }

    public void setTicketHolder(String ticketHolder) {
        this.ticketHolder = getTicketHolder();
    }

    public String getDate() {
        this.date = getDate();
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "The ticket with ID: " + ticketSerialNumber +
                "belongs to " + ticketHolder +
                "departing from " + departure +
                "arriving to " + destination ;
    }
}

