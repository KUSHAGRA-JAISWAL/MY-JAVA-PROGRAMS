/**
 * @file Employee.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-20
 * @copyright Copyright (c) 2023
 */

/*
Consider an abstract class Employee with an abstract method generatePaySlip. Make Faculty and Staff the concrete
subclasses of Employee. An employee has a name, address, an office and a basic pay. A faculty member has a rank and an
additional academic pay apart from the basic pay. If the rank of a faculty member is Professor then his academic pay is 100000
rupees; otherwise it is 50000 rupees. The salary of a faculty member is computed as the sum of the basic pay and the academic
pay. A staff member has a title and a pay depending on her/his title. If the staff member is a manager then her/his salary is
computed as the sum of the basic pay and an additional allowance of 30% of the basic pay; otherwise it is the sum of the basic
pay and an additional allowance of 10% of the basic pay. Develop a program that creates an Employee, Faculty, and Staff
object and invokes their generatePaySlip method. 
 */
package src.assignments.cat.set_A;

abstract class Employee {
    abstract double generatePaySlip();
    String name;
    String address;
    double basic_pay;
    String rank;

    public Employee(String name, String address, double basic_pay, String rank){
        this.name = name;
        this.address = address;
        this.basic_pay = basic_pay;
        this.rank = rank;
    }
}

class Faculity extends Employee{
    public Faculity(String name, String address, double basic_pay, String rank){
        super(name, address, basic_pay, rank);
    }
    double generatePaySlip(){
        if(this.rank == "professor"){
            return 100000 + this.basic_pay;
        }
        return 50000 + this.basic_pay;
    }
}

class Staff extends Employee{
    public Staff(String name, String address, double basic_pay, String rank){
        super(name, address, basic_pay, rank);
    }
    double generatePaySlip(){
        if(this.rank == "manager"){
            return (this.basic_pay * 0.30) + this.basic_pay;
        }
        return (this.basic_pay * 0.10) + this.basic_pay;
    }
}

class Salary{
    public static void main(String[] args) {
        Faculity f = new Faculity("Abc", "xyz", 100000, "professor");
        System.out.println(f.generatePaySlip());

        Staff s = new Staff("xyz","abc",4000, "driver");
        System.out.println(s.generatePaySlip());
    }
}