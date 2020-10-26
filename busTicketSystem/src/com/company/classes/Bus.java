package com.company.classes;

import com.company.interfaces.BusInterface;

import java.util.Arrays;


public class Bus implements BusInterface {

    public static int row = 20;
    public static int col = 2;
    public static Passenger[][] left = new Passenger[row][col];
    public static Passenger[][] right = new Passenger[row][col];

    private String departure;
    private String destination;

    public Bus(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

// refactor!!!!
    public boolean checkIfThereIsAvailableSeat() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (left[i][j] == null) {
                    return true;
                }
            }
        }

        for (int z = 0; z < row; z++) {
            for (int k = 0; k < col; k++) {
                if (right[z][k] == null) {
                    return true;
                }
            }
        }

        return false;
    }

    public void reserveNextAvailableSeat(Passenger p) {
        search:
        {
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    if (left[r][c] == null) {
                        left[r][c] = p;
                        break search;
                    }
                }
            }

            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    if (right[r][c] == null) {
                        right[r][c] = p;
                        break search;
                    }
                }
            }
        }
    }

    public void deleteSeatReservation(String side, int row, int seat) {
        String l = "left";
        String r = "right";

        if(l.equals(side)) {
            left[row][seat] = null;
        }
        if(r.equals(side)) {
            left[row][seat] = null;
        }
    }

    public void deletePassengerReservation(Passenger p) {
        search:
        {
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    if (left[r][c].equals(p)) {
                        left[r][c] = null;
                        break search;
                    }
                }
            }

            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    if (right[r][c].equals(p)) {
                        right[r][c] = null;
                        break search;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Passengers on route " + departure + " to " + destination + " are " ;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }
}
