package innerClasses.anonymous.timer;

import java.awt.*;
import javax.swing.*;
import java.util.Date;
import java.awt.event.*;

// CallBack methods using anonymous classes - 2

public class TimerExample2 {
    public static void main(String[] args) {
        ActionListener listener1 = new TimePrinter2();
        Timer t1 = new Timer(1000, listener1);
        // t1.start();

        Timer t2 = new Timer(1000, new HelloPrinter2());
        // t2.start();

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t3 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello.");
            }
        });
        // t3.start();

        Timer t4 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("How are you?");
            }
        });
        //  t4.start();

        Timer t5 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi.");
            }
        });
        t5.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

class HelloPrinter2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello.");
        Toolkit.getDefaultToolkit().beep();
    }
}
