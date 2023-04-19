/**
 * @file Invoice.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-19
 * @copyright Copyright (c) 2023
 */

/*
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold
at the store. An Invoice should include four pieces of information as instance variables—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor that initializes the four instance variables.
Provide a set and a get method for each instance variable. In addition, provide a method named
getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the
price per item is not positive, it should be set to 0.0. Write a test app named InvoiceTest that
demonstrates class Invoice’s capabilities. 
*/
package src.assignments.class_object;

public class Invoice {
    String part_number;
    String part_description;
    int quantity;
    double price_per_item;

    public Invoice(String part_number, String part_description, int quantity, double price_per_item){
        this.part_number = part_number;
        this.part_description = part_description;
        this.quantity = quantity;
        this.price_per_item = price_per_item;
    }

    public void setPartNumber(String part_number){
        this.part_number = part_number;
    }

    public String getPartNumber(){
        return this.part_number;
    }

    public void setPartDescription(String part_description){
        this.part_description = part_description;
    }

    public String getPartDescription(){
        return this.part_description;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setPricePerItem(double price_per_item){
        this.price_per_item = price_per_item;
    }

    public double getPricePerItem(){
        return this.price_per_item;
    }

    public double getInvoiceAmount(){
        if(this.quantity < 0)
            this.quantity = 0;
        return this.quantity * this.price_per_item;
    }
}

class InvoiceTest{
    public static void main(String[] args) {
        Invoice[] arr_invo = new Invoice[3];

        arr_invo[0] = new Invoice("1", "Item 1", 10, 100);
        arr_invo[1] = new Invoice("2", "Item 2", -40, 200);
        arr_invo[2] = new Invoice("3", "Item 3", 30, 300);
        
        for (int i = 0; i < arr_invo.length; i++) {
            System.out.println("Part Number: " + arr_invo[i].getPartNumber());
            System.out.println("Part Description: " + arr_invo[i].getPartDescription());
            System.out.println("Quantity: " + arr_invo[i].getQuantity());
            System.out.println("Price Per Item: " + arr_invo[i].getPricePerItem());
            System.out.println("Invoice Amount: " + arr_invo[i].getInvoiceAmount());
            System.out.println();
        }
    }
}
