package innerClasses.anonymous.event;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyApplication extends JFrame {
    private Container contentPane;
    private JLabel label = new JLabel();

    public MyApplication(){
        setTitle("My Application");
        contentPane = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        start();
    }

    public static void main(String[] args) {
        MyApplication frame = new MyApplication();
        frame.setVisible(true);
    }

    public void start(){
        label.setBackground(Color.BLACK);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setText("No button clocked yet!");

        JButton button1 = new JButton();
        button1.setText("Button 1");
        button1.addActionListener(new MyActionListener(this));

        JButton button2 = new JButton();
        button2.setText("Button 2");

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JButton button = (JButton) event.getSource();
                String buttonLAbel = button.getText();
                buttonClicked(buttonLAbel);
            }
        });

        JPanel northPanel = new JPanel();
        northPanel.add(label);
        contentPane.add(northPanel, BorderLayout.NORTH);

        JPanel centralPanel = new JPanel();
        centralPanel.add(button1);
        centralPanel.add(button2);
        contentPane.add(centralPanel);
    }

    public void buttonClicked(String text){
        label.setText(text + " is clicked!");
    }
}
