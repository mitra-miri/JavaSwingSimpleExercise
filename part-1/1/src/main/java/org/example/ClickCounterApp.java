package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterApp extends JFrame implements ActionListener {

    private JButton clickButton;
    private JLabel counterLabel;
    private int counter = 0;

    public ClickCounterApp() {

        setTitle("Click Counter ๏̯̃๏  ");
        counterLabel = new JLabel("Clicks : 0" , SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(counterLabel , BorderLayout.CENTER);
        add(clickButton , BorderLayout.SOUTH);

        getContentPane().setBackground(Color.decode("#d3b1ed"));



    }


    @Override
    public void actionPerformed(ActionEvent e){
        counter++;
        counterLabel.setText("Clicks : " + counter);
    }

}
