package src.assignments.cat_2.multithreading;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

class Assignment6DB extends Frame implements ActionListener {
    Button b1, b2, b3, b4;
    Panel top, bottom;
    TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
    TextArea ta1;
    Label l1, l2, l3, l4, l5, l6, l7, l8, l9;
    Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

    Assignment6DB() {
        setVisible(true);
        setSize(750, 700);
        setTitle("Assignment6DB");

        setFont(new Font("Arial", Font.BOLD, 25));
        bottom = new Panel();
        b1 = new Button("view");
        bottom.add(b1);
        b2 = new Button("insert");
        bottom.add(b2);
        b3 = new Button("delete");
        bottom.add(b3);
        b4 = new Button("clear");
        bottom.add(b4);
        add(bottom, "South");
        top = new Panel();
        top.setBackground(Color.cyan);
        l1 = new Label("ID");
        top.add(l1);
        tf1 = new TextField(10);
        top.add(tf1);
        l2 = new Label("LastName");
        top.add(l2);
        tf2 = new TextField(20);
        top.add(tf2);
        l3 = new Label("FirstName");
        top.add(l3);
        tf3 = new TextField(20);
        top.add(tf3);
        l4 = new Label("MI");
        top.add(l4);
        tf4 = new TextField(10);
        top.add(tf4);
        l5 = new Label("Address");
        top.add(l5);
        ta1 = new TextArea(5, 10);
        top.add(ta1);
        l6 = new Label("City");
        top.add(l6);
        tf5 = new TextField(20);
        top.add(tf5);
        l7 = new Label("State");
        top.add(l7);
        tf6 = new TextField(20);
        top.add(tf6);
        l8 = new Label("Telephone");
        top.add(l8);
        tf7 = new TextField(10);
        top.add(tf7);
        l9 = new Label("EmailID");
        top.add(l9);
        tf8 = new TextField(30);
        top.add(tf8);
        add(top, "Center");
        validate();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");// type-4 driver for oracle
            con = DriverManager.getConnection("jdbc:oracle:thin:1521:@xe", "system", "system");// URL,USerName,Password
            String str = ae.getActionCommand();
            if (str.equals("clear"))// clear operation
            {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                ta1.setText("");
            } else if (str.equals("insert"))// insert operation
            {
                String id = tf1.getText();
                String lname = tf2.getText();
                String fname = tf3.getText();
                String mi = tf4.getText();
                String address = ta1.getText();
                String city = tf5.getText();
                String state = tf6.getText();
                String phone = tf7.getText();
                String email = tf8.getText();
                PreparedStatement pst = con.prepareStatement("insert into staff values(?,?,?,?,?,?,?,?,?)");
                pst.setString(1, id);
                pst.setString(2, lname);
                pst.setString(3, fname);
                pst.setString(4, mi);
                pst.setString(5, address);
                pst.setString(6, city);
                pst.setString(7, state);
                pst.setString(8, phone);
                pst.setString(9, email);
                int i = pst.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Values Inserted");
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                    tf6.setText("");
                    tf7.setText("");
                    ta1.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "something went worg,Try again");
                }
            } // end of else if

            else if (str.equals("update"))// update operation
            {
                String id = tf1.getText();
                String lname = tf2.getText();
                String fname = tf3.getText();
                String mi = tf4.getText();
                String address = ta1.getText();
                String city = tf5.getText();
                String state = tf6.getText();
                String phone = tf7.getText();
                String email = tf8.getText();
                PreparedStatement pst = con.prepareStatement(
                        "update staff set lastName=?,firstName=?,mi=?,address=?,city=?,state=?,telephone=?,email=? where id=?");
                pst.setString(9, id);
                pst.setString(1, lname);
                pst.setString(2, fname);
                pst.setString(3, mi);
                pst.setString(4, address);
                pst.setString(5, city);
                pst.setString(6, state);
                pst.setString(7, phone);
                pst.setString(8, email);
                int i = pst.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Values are Updated");
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                    tf6.setText("");
                    tf7.setText("");
                    ta1.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "something went worg,Try again");
                }
            } // end of else if

            else if (str.equals("view"))// for view operation
            {
                String id = tf1.getText();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from staff where id='" + id + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Records Found");
                    tf1.setText(rs.getString(1));
                    tf2.setText(rs.getString(2));
                    tf3.setText(rs.getString(3));
                    tf4.setText(rs.getString(4));
                    ta1.setText(rs.getString(5));
                    tf5.setText(rs.getString(6));
                    tf6.setText(rs.getString(7));
                    tf7.setText(rs.getString(8));
                    tf8.setText(rs.getString(9));
                } else {
                    JOptionPane.showMessageDialog(null, "Records Not Found,Enter Correct Id");
                }
            } // end of else if

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Assignment6DB();
    }
}