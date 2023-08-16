package bank;

import javax.swing.*;

public class Deposit extends JFrame {
    String pin;

    Deposit(String pin){
        this.pin = pin;
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
        //ssss

    }
    public static void main(String[] args) {
        new Deposit("");
    }

}