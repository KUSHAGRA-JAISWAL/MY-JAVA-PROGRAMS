/**
 * @file Cab.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-19
 * @copyright Copyright (c) 2023
 */

/*
Create a class called Cab to represent a cab on hire. A cab should include four pieces of information as
instance variables - a cab registration number (type String), name of the driver (type String), the rate per
kilometer (type double) and the total distance it covered on hire on a day (type double). The Cab class
should have a constructor that initializes the four instance variables. Provide a set and a get method for
each instance variable. In addition, provide a method named computeIncome that calculates the daily
income based on the total distance that it travelled on hire and returns the daily income as a double
value. The registration number and driver name must be available and the rate per kilometer and total
distance cannot be negative. Write a test application named Income that demonstrates creation of an
array of objects of size three of the Cab class and display the daily income from each cab along with its
registration number and driver’s name.
 */

package src.assignments.class_object;

public class Cab {
    String reg_no;
    String driver_name;
    double rate_per_km;
    double total_distance;

    public Cab(String reg_no, String driver_name, double rate_per_km, double total_distance){
        this.reg_no = reg_no;
        this.driver_name = driver_name;
        this.rate_per_km = rate_per_km;
        this.total_distance = total_distance;
    }

    public void setRegno(String reg_no){
        this.reg_no = reg_no;
    }

    public String getRegno(){
        return this.reg_no;
    }

    public void setDriverName(String driver_name){
        this.driver_name = driver_name;
    }

    public String getDriverName(){
        return this.driver_name;
    }

    public void setRatePerKm(double rate_per_km){
        this.rate_per_km = rate_per_km;
    }

    public double getRatePerKm(){
        return this.rate_per_km;
    }

    public void setTotalDistance(double total_distance){
        this.total_distance = total_distance;
    }

    public double getTotalDistance(){
        return total_distance;
    }

    public double ComputeIncome(){
        return this.rate_per_km * this.total_distance;
    }
}

class Income{
    public static void main(String[] args) {
        Cab[] cab_arr = new Cab[3];
        
        cab_arr[0] = new Cab("Ka-01-hH-1234", "Raj", 10.0, 100.0);
        cab_arr[1] = new Cab("Ka-01-hH-9999", "sharma", 14.0, 100.0);
        cab_arr[2] = new Cab("Ka-01-hH-0000", "Kumar", 20.0, 100.0);

        for (int i = 0; i < cab_arr.length; i++) {
            System.out.println("Cab " + (i+1) + " :");
            System.out.println("Registration Number : " + cab_arr[i].getRegno());
            System.out.println("Driver Name : " + cab_arr[i].getDriverName());
            System.out.println("Daily Income : " + cab_arr[i].ComputeIncome());
            System.out.println();
        }
    }
}
