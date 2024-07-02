//package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{

    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(){

        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = il.getImage() .getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text =new JLabel("Welcome to ATM");
        text.setFont (new Font("Raleway", Font.BOLD, 28)); 
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno =new JLabel("Card No:");
        cardno.setFont (new Font("Raleway", Font.BOLD, 28)); 
        cardno.setBounds(120, 150, 400, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cardTextField.setBounds(300, 150, 230,30);
        add(cardTextField);

        JLabel pin =new JLabel("Pin No:");
        pin.setFont (new Font("Raleway", Font.BOLD, 28)); 
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinTextField.setBounds(300, 220, 230,30);
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        add(login);
        login.setBackground(Color.BLACK); 
        login.setForeground(Color.white); 
        login.addActionListener(this);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        add(clear);
        clear.setBackground(Color.BLACK); 
        clear.setForeground(Color.white); 
        clear.addActionListener(this);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        add(signup);
        signup.setBackground(Color.BLACK); 
        signup.setForeground(Color.white); 
        signup.addActionListener(this);

        getContentPane() .setBackground(Color.WHITE);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == clear){
        cardTextField.setText("");
        pinTextField.setText("");
       }
        else if (ae.getSource() == login){

        }
       else if(ae.getSource() == signup){

       }


    }
    public static void main(String[] args){
        new Login();
    }
}