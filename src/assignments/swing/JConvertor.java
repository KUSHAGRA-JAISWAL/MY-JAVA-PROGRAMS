/*
2. Develop and test a program using Java Swing / AWT that converts between decimal, hex, and binary
numbers, as shown in the Figure below. When you enter a decimal value in the Decimal value text field
and press the Enter key, its corresponding hex and binary numbers are displayed in the other two text
fields. Likewise, you can enter values in the other fields and convert them accordingly. 
 */

package src.assignments.swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JConvertor extends JFrame implements KeyListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    public JConvertor(String s) {
        super(s);
    }

    void createWindow() {
        l1 = new JLabel("Decimal");
        l2 = new JLabel("Hex");
        l3 = new JLabel("Binary");
        t1 = new JTextField(12);
        t2 = new JTextField(12);
        t3 = new JTextField(12);

        t1.addKeyListener(this);
        t2.addKeyListener(this);
        t3.addKeyListener(this);

        setVisible(true);
        setSize(400, 200);

        setLayout(new GridLayout(3, 2));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
    }

    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String hexToBinary(String hex) {
        return decimalToBinary(hexToDecimal(hex));
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String binaryToHex(String binary) {
        return decimalToHex(binaryToDecimal(binary));
    }

    public void keyReleased(KeyEvent e) {

        try{
        if (e.getSource() == t1) {
            int n1 = Integer.parseInt(t1.getText());
            t2.setText(decimalToHex(n1));
            t3.setText(decimalToBinary(n1));
            System.out.println(n1);
        }
        if (e.getSource() == t2) {
            String n2 = t2.getText();
            t1.setText(String.valueOf(hexToDecimal(n2)));
            t3.setText(hexToBinary(n2));
            System.out.println(n2);
        }
        if (e.getSource() == t3) {
            String n3 = t3.getText();
            t1.setText(String.valueOf(binaryToDecimal(n3)));
            t2.setText(binaryToHex(n3));
            System.out.println(n3);
        }
    }catch(NumberFormatException ne){
        System.out.println("Invalid input");
    }
    catch(Exception ex){
        System.out.println("Error");
    }
    }
    
    public void keyPressed(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {

        JConvertor j = new JConvertor("Convert numbers");
        j.createWindow();
    }
}
