package bank;

import javax.swing.*;
import java.awt.*;

public class Singup2  extends JFrame {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4;
    JTextField textPan,textId;

    String formno;

    Singup2(String first){
        super("APPLICATION FORM");

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Railway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);
        JLabel l2 = new JLabel("Additonal Details");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Sinhala","Tamil","Muslim","Christrian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Railway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Railway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Railway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","5,00,00","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Railway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education");
        l6.setFont(new Font("Railway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education[] = {"Non-Graduate","Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation");
        l7.setFont(new Font("Railway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox4 = new JComboBox(occupation);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(350,340,320,30);
        add(comboBox4);

        JLabel l8 = new JLabel("PAN Number");
        l8.setFont(new Font("Railway",Font.BOLD,18));
        l8.setBounds(100,390,320,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Railway",Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9 = new JLabel("ID Number");
        l9.setFont(new Font("Railway",Font.BOLD,18));
        l9.setBounds(100,440,320,30);
        add(l9);

        textId = new JTextField();
        textId.setFont(new Font("Railway",Font.BOLD,18));
        textId.setBounds(350,440,320,30);
        add(textId);







        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);


    }


    public static void main(String[] args) {
        new Singup2("");

    }
}
