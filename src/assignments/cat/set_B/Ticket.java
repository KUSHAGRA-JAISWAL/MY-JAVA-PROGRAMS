/**
 * @file Ticket.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-20
 * @copyright Copyright (c) 2023
 */

/*
Develop an interface called Ticket with two methods namely, bookTicket and printTicket. Develop two classes namely,
TrainTicket and FlightTicket that implement the methods of the interface Ticket. The TrainTicket class has a Train_no and
PNR_no as data members. The bookTicket method assigns values to Train_no and PNR_no for a ticket taken as user inputs and
printTicket method displays these information along with the total fare defined by the sum of base fare and reservation charge
taken as user inputs. The FlightTicket class has a Flight_no as its data member. The bookTicket method assigns value to
Flight_no entered as user input and the printTicket method displays flight number along with the total fare defined by the sum
of base fare (taken as user input) and taxes at the rate of 30% of the base fare. Develop a driver class to invoke bookTicket and
printTicket for train ticket and flight ticket. 
 */

package src.assignments.cat.set_B;
import java.util.Scanner;

interface Ticket{
    public void bookTicket();
    public void printTicket();
}

class TrainTicket implements Ticket{
    String Train_no;
    String PNR_no;
    int total_fare;
    int reservation_charges;
    int base_fare;

    public void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Train No: ");
        Train_no = sc.nextLine();

        System.out.print("Enter PNR No: ");
        PNR_no = sc.nextLine();

        System.out.print("Enter Base Fare: ");
        base_fare = sc.nextInt();

        System.out.print("Enter Reservation Charges: ");
        reservation_charges = sc.nextInt();
    }

    public void printTicket(){
        System.out.println("Train No: " + Train_no);
        System.out.println("PNR No: " + PNR_no);
        System.out.println("Base Fare: " + base_fare);
        System.out.println("Reservation Charges: " + reservation_charges);
        total_fare = base_fare + reservation_charges;
        System.out.println("Total Fare: " + total_fare);
    }
}

class FlightTicket implements Ticket{
    String Flight_no;
    int total_fare;
    int base_fare;

    public void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Flight No: ");
        Flight_no = sc.nextLine();

        System.out.print("Enter Base Fare: ");
        base_fare = sc.nextInt();
    }

    public void printTicket(){
        System.out.println("Flight No: " + Flight_no);
        System.out.println("Base Fare: " + base_fare);
        total_fare = base_fare + (int)(base_fare * 0.3);
        System.out.println("Total Fare: " + total_fare);
    }
}

class DriverTicket{
    public static void main(String[] args) {
        TrainTicket tt = new TrainTicket();
        FlightTicket ft = new FlightTicket();

        tt.bookTicket();
        tt.printTicket();

        ft.bookTicket();
        ft.printTicket();
    }
}