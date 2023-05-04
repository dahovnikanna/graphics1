package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UA extends JFrame {

    public UA() {
        super("Виды графики");
        super.setBounds(350, 70, 800, 650);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.getContentPane().setBackground(Color.lightGray);
        super.getContentPane().setLayout(null);

        JLabel label = new JLabel("Программная реализация графических алгоритмов Java");
        label.setBounds(200,30,400,50);
        super.getContentPane().add(label);

        Container container = super.getContentPane();

        JButton vectorBtn = new JButton("Векторная графика");
        vectorBtn.setBounds(70, 550, 200, 30);
        vectorBtn.setBackground(Color.gray);

        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VectorDice vectorDice = new VectorDice();
                vectorDice.show_frame();

            }
        };
        vectorBtn.addActionListener(listener1);

        JButton rastr = new JButton("Растровая графика");
        rastr.setBounds(290, 550, 200, 30);
        rastr.setBackground(Color.gray);

        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Picture picture = new Picture();
                picture.rastimage();
            }
        };
        rastr.addActionListener(listener2);

        JButton volume = new JButton("Объемная графика");
        volume.setBounds(510, 550, 200, 30);
        volume.setBackground(Color.gray);

        ActionListener listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Volum volum = new Volum();
                volum.show();

            }
        };
        volume.addActionListener(listener3);

        container.add(vectorBtn);
        container.add(rastr);
        container.add(volume);


    }

}


