package bank;

import javax.swing.*;
import java.awt.*;

public class Login  extends JFrame {

    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;

    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png") );
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png") );
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image1 = new JLabel(ii3);
        image1.setBounds(630, 350,100,100);
        add(image1);

        label1 = new JLabel("WELCOME TO ATM..!");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Cart No:");
        label2.setFont(new Font("Ralway", Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway", Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);
        



        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png") );
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel image2 = new JLabel(iii3);
        image2.setBounds(0, 0,850,480);
        add(image2);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
