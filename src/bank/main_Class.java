package bank;

import javax.swing.*;
import java.awt.*;

public class main_Class extends JFrame {

    JButton b1,b2,b3,b4,b5,b6,b7;
    main_Class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        b1 =  new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,272,150,35);
        l3.add(b1);


        b2 =  new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(410,317,150,35);
        l3.add(b2);

        b3 = new JButton("dffef");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,362,150,35);
        l3.add(b3);

        b4 = new JButton("sndjnd");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(410,410,150,35);
        l3.add(b4);

        b5 = new JButton("sithumfd");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(700,272,150,35);
        l3.add(b5);
        
        b6 = new JButton("ddjcdndj");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,317,150,35);
        l3.add(b6);

        b7 = new JButton("sdhsdbds");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,362,150,35);
        l3.add(b7);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    public static void main(String[] args) {
        new main_Class();

    }
}
