package com.company;

import com.company.systems.TicketSystem;

public class Main {

    public static void main(String[] args) {

        //Create the system
        TicketSystem sys = new TicketSystem();

        //Passengers created in the system
        sys.createPassenger("Bernadett", "21.00.1990", "Markveien 20");
        sys.createPassenger("Zsanett", "13.00.1997", "Hinnaveien 40");

        //Buses created in the system
        sys.createBus("Oslo", "Stavanger");
        sys.createBus("Oslo", "Voss");
        sys.createBus("Oslo", "Bergen");
        sys.createBus("Stavanger", "Bergen");
        sys.createBus("Bergen", "Trondheim");
        sys.createBus("Trondheim", "Hemsedal");


        //Ticket added to passenger and displayed

        sys.findPassengerByName("Bernadett").createTicket("24.09.2020", "Oslo", "Stavanger");
        sys.findPassengerByName("Bernadett").createTicket("21.12.2020", "Stavanger", "Bergen");
        sys.printPassengerTickets("Bernadett");


        sys.addPassengerToBus(sys.findPassengerByName("Bernadett"), "Oslo", "Stavanger");
        sys.addPassengerToBus(sys.findPassengerByName("Bernadett"), "Stavanger", "Bergen");
        sys.addPassengerToBus(sys.findPassengerByName("Zsanett"), "Stavanger", "Bergen");

        System.out.println("Are there any available seats from Stavanger to Bergen?" +
                sys.checkAvailability("Stavanger", "Bergen"));

        System.out.println(sys.findBus("Stavanger", "Bergen").toString());

        System.out.println(sys.findPassengerByName("Bernadett").toString());
    }
}
