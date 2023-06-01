package src.assignments.cat_2.swing;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class intro extends JFrame {
    JLabel l;
    intro() {
        l = new JLabel();
        ImageIcon icon = new ImageIcon("src\\assignments\\cat_2\\swing\\cal.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        l.setText("Humar Calculator Ba!");
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.TOP);
        l.setForeground(new Color(255,0,0));
        l.setFont(new Font("MV Boli", Font.PLAIN, 20));
        l.setIcon(icon);
        l.setBackground(Color.black);
        l.setOpaque(true);
        l.setBorder(border);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(0,0,500,500);

        this.setTitle("Introduction");
        this.setLayout(null);
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setIconImage(icon.getImage());
        this.add(l);
      
    }

    public static void main(String[] args) {
        new intro();
    }
}
