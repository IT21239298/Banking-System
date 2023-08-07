package bank;

import javax.swing.*;
import java.awt.*;

public class Signup3 extends JFrame {

    Signup3(){

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);


    }


    public static void main(String[] args) {
        new Signup3();

    }
}
