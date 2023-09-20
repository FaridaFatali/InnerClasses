package innerClasses.anonymous.timer;

import java.awt.*;
import javax.swing.*;
import java.util.Date;
import java.awt.event.*;

// CallBack methods using anonymous classes - 1

public class TimerExample1 {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter1();
        Timer t1 = new Timer(1000, listener);
        // t1.start();

        Timer t2 = new Timer(1000, new HelloPrint1());
        t2.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

class HelloPrint1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello.");
        Toolkit.getDefaultToolkit().beep();
    }
}

