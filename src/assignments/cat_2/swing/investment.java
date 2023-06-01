package src.assignments.cat_2.swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class investment extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public investment(String msg) {
        super(msg);
    }

    public void createWindow(){
        l1 = new JLabel("Investment Amount:  ");
        l2 = new JLabel("Number of Years:    ");
        l3 = new JLabel("Annual Intrest Rate:");
        l4 = new JLabel("Future Value:       ");
        l1.setHorizontalAlignment(JLabel.LEFT);
        l2.setHorizontalAlignment(JLabel.LEFT);
        l3.setHorizontalAlignment(JLabel.LEFT);
        l4.setHorizontalAlignment(JLabel.LEFT);

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t1.setHorizontalAlignment(JLabel.RIGHT);
        t2.setHorizontalAlignment(JLabel.RIGHT);
        t3.setHorizontalAlignment(JLabel.RIGHT);
        t4.setHorizontalAlignment(JLabel.RIGHT);

        b1 = new JButton("Calculate");
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setBounds(100, 100, 100, 100);

        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double c = Double.parseDouble(t3.getText());
        double d = 0;
        if(e.getSource() == b1){
            d = a * Math.pow((1 + c), (b*12));
            t4.setText(String.valueOf(d));
        } 
    }

    public static void main(String[] args) {
        investment i = new investment("Investment");
        i.createWindow();
    }
}
