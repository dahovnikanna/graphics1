package com.example.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    // создание главного окна
    public UI() {
        super("Виды графики");
        super.setBounds(350, 70, 800, 650);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.getContentPane().setBackground(Color.lightGray);
        super.getContentPane().setLayout(null);

        JLabel label = new JLabel("Программная реализация графических алгоритмов Java");
        label.setBounds(200, 30, 400, 50);
        super.getContentPane().add(label);

        Container container = super.getContentPane();

        //region Создание кнопок

        //region VectorBtn
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
//endregion

        // region RasterBtn
        JButton rasterBtn = new JButton("Растровая графика");
        rasterBtn.setBounds(290, 550, 200, 30);
        rasterBtn.setBackground(Color.gray);

        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Picture picture = new Picture();
                picture.rasterImage();
            }
        };
        rasterBtn.addActionListener(listener2);
        // endregion

        // region VolumeBtn
        JButton volumeBtn = new JButton("Объемная графика");
        volumeBtn.setBounds(510, 550, 200, 30);
        volumeBtn.setBackground(Color.gray);

        ActionListener listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VolumeDice volumeDice = new VolumeDice();
                volumeDice.show();
            }
        };
        volumeBtn.addActionListener(listener3);
        //endregion

        container.add(vectorBtn);
        container.add(rasterBtn);
        container.add(volumeBtn);
    }

}
