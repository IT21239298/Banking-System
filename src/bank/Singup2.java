package bank;

import javax.swing.*;
import java.awt.*;

public class Singup2  extends JFrame {

    Singup2(){
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);


    }


    public static void main(String[] args) {
        new Singup2();

    }
}
