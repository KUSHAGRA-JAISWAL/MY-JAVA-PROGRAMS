package src.assignments.cat_2.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class CreateTwoWindow extends JFrame implements ActionListener {

    CreateTwoWindow(String str) {
        super(str);
    }

    JLabel l1;
    JButton b1, b2;

    void createWindow() {
        l1 = new JLabel(" Press Button for different actions");
        b1 = new JButton("child 1");
        b2 = new JButton("child2");
        add(l1);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            Child1Window c1 = new Child1Window("child1 window opened");
            c1.createWindow();

        }
        if (e.getSource() == b2) {
            Child2Window c2 = new Child2Window("child2 window opened");
            c2.createWindow();
        }
    }

    public static void main(String[] args) {
        CreateTwoWindow ctw = new CreateTwoWindow("Systuumm!");
        ctw.createWindow();

    }

}

class Child1Window extends JFrame implements ActionListener

{
    Child1Window(String str) {
        super(str);
       // int i = 1;
    }

    JLabel l1;
    JButton b1;
    int i = 1;

    void createWindow() {
        l1 = new JLabel("welcome to child1");
        b1 = new JButton("change colour");
        add(l1);
        add(b1);
        b1.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            i = i * -1;
            if (i == -1) {

                getContentPane().setBackground(Color.MAGENTA);
            }
        }
        if (i == 1) {
            getContentPane().setBackground(Color.GREEN);
        }

    }

}

class Child2Window extends JFrame implements ActionListener

{
    Child2Window(String str) {
        super(str);

    }

    JLabel l1;
    JButton b1, b2;

    public void createWindow() {
        l1 = new JLabel("welcome to child2");
        b1 = new JButton("CHANGE LABEL");
        b2 = new JButton("Draw");
        add(l1);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setText("CHANGED LABEL");
        }
        if (e.getSource() == b2) {
            l1.setText("Loading!!");
            Child2Child c2c = new Child2Child("Start drawing..");
            c2c.createWindow();
        }

    }

}

class Child2Child extends JFrame implements MouseMotionListener {
    Child2Child(String str) {
        super(str);

    }

    JLabel l1;
    JButton b1, b2;

    public void createWindow() {

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseMotionListener(this);

    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 15, 15);

    }

    public void mouseMoved(MouseEvent e) {

    }

}