/*
Implement a class named Fan to represent a fan in a package. The class contains a private int data field named speed, a
private boolean data field named on (the default is false), a private double data field named radius (the default is 5), a string
data field named color (the default is blue), the accessor and mutator methods for all four data fields, a no-arg constructor that
creates a default fan, a four-argument constructor, a method named toString() that returns a string description for a fan. If a
fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns
the fan color and radius along with the string “fan is off” in one combined string. Implement a driver class in another package
to demonstrate toString method on a Fan object after receiving the fan’s information interactively through keyboard. [
 */

package src.assignments.cat.set_B.pac1;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color ;

    public Fan(){
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public boolean getOn(){
        return this.on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        if(on){
            return "Speed: " + speed + " Color: " + color + " Radius: " + radius;
        }
        else{
            return "Color: " + color + " Radius: " + radius + " Fan is off";
        }
    }
}