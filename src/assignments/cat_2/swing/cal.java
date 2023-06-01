package src.assignments.cat_2.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cal extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;

    public cal(String msg){
        super(msg);
    }

    public void createWindow(){
        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Result");

        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");

        setVisible(true);
        setSize(400,100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2); add(b3); add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double c = 0;

        if(e.getSource() == b1){
            c = a + b;
            t3.setText(String.valueOf(c));
        }else if(e.getSource() == b2){
            c = a - b;
            t3.setText(String.valueOf(c));
        }else if(e.getSource() == b3){
            c = a * b;  
            t3.setText(String.valueOf(c));
        }else if(e.getSource() == b4){
            c = a / b;
            t3.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        cal c = new cal("Calculator");
        c.createWindow();
    }
}
