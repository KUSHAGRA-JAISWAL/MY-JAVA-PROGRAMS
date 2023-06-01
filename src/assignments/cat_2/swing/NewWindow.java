package src.assignments.cat_2.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow extends JFrame implements ActionListener {
    JButton b1, b2, b3;

    public NewWindow(String msg) {
        super(msg);
    }

    public void createWindow() {
        b1 = new JButton("Calculater");
        b2 = new JButton("Color Change");
        b3 = new JButton("Mouse Event");

        setVisible(true);
        setSize(400, 100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            call c = new call("Calculater");
            c.createWindow();
        } else if (e.getSource() == b2) {
            ColorChange cc = new ColorChange("Color Change");
            cc.createWindow();
        } else if (e.getSource() == b3) {
            Mouseevent me = new Mouseevent("Mouse Event");
            me.createWindow();
        }
    }

    public static void main(String[] args) {
        NewWindow nw = new NewWindow("New Window");
        nw.createWindow();
    }
}

class call extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    public call(String msg) {
        super(msg);
    }

    public void createWindow() {
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
        setSize(400, 100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double c = 0;

        if (e.getSource() == b1) {
            c = a + b;
            t3.setText(String.valueOf(c));
        } else if (e.getSource() == b2) {
            c = a - b;
            t3.setText(String.valueOf(c));
        } else if (e.getSource() == b3) {
            c = a * b;
            t3.setText(String.valueOf(c));
        } else if (e.getSource() == b4) {
            c = a / b;
            t3.setText(String.valueOf(c));
        }
    }
}

class ColorChange extends JFrame implements ActionListener {
    JButton b1;
    int a = 1;

    public ColorChange(String msg) {
        super(msg);
    }

    public void createWindow() {
        b1 = new JButton("Change Color");
        setVisible(true);
        setSize(500, 500);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setVerticalAlignment(JLabel.CENTER);
        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            a = a * -1;
            if (a == -1) {
                b1.setBackground(new Color(123, 50, 250));
            }
        }
        if (a == 1) {
            b1.setBackground(new Color(255, 0, 0));
        }
    }
}

class Mouseevent extends JFrame implements ActionListener, MouseMotionListener {
    JLabel l1;
    JButton b2;

    public Mouseevent(String msg) {
        super(msg);
    }

    public void createWindow() {
        l1 = new JLabel("Mouse Event");
        b2 = new JButton("Draw");
        b2.addActionListener(this);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(l1);

        l1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                l1.setText("Mouse Clicked");
            }

            public void mouseEntered(java.awt.event.MouseEvent e) {
                l1.setText("Mouse Entered");
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                l1.setText("Mouse Exited");
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b2) {
            l1.setText("Loading!!");
            Mouseevent me = new Mouseevent("Start drawing..");
            me.createWindow();
        }

    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.GREEN);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public void mouseMoved(MouseEvent e) {
    }
}