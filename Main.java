package com.company;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static JFrame gui = new JFrame();
    public static JTextArea text = new JTextArea(6, 50);
    public static JButton calculate = new JButton("CALCULATE");
    public static JLabel result = new JLabel();
    public static void main(String[] args)
    {
        calculate.addActionListener(e ->
        {
            //calc();
            //ispin();
            isemail();
        });
        gui.setSize(new Dimension(600, 400));
        gui.setLayout(new FlowLayout());
        gui.add(text);

        gui.add(calculate);
        gui.add(result);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void calc()
    {
        int sum = 0;
        int average = 0;
        String temp = text.getText();
        String[] temp2 = temp.split("\\+");
        for(String word : temp2)
        {
            sum = sum + Integer.parseInt(word);
        }
        average = sum/temp2.length;
        result.setText("SUM: " + sum + " AVERAGE: " + average);
    }
    public static void ispin()
    {
        String temp = text.getText();
        if(temp.matches("\\d{4}"))
        {
            result.setText("TRUE");
        }
        else
        {
            result.setText("FALSE");
        }
    }
    public static void isemail()
    {
        String temp = text.getText();
        if(temp.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            result.setText("TRUE");
        }
        else
        {
            result.setText("FALSE");
        }
    }
}
