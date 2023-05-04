package com.example.demo;

import javax.swing.*;
import java.awt.*;

public class VectorDice extends JPanel {

    private static final int SIZE = 200;

    public void paint(Graphics g) {
        super.paint(g);

// Основа кости-прямоугольник
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, SIZE, SIZE);
// Кругляшки
        g.fillOval(130, 120, 30, 30);
        g.fillOval(185, 185, 30, 30);
        g.fillOval(130, 250, 30, 30);
        g.fillOval(240, 120, 30, 30);
        g.fillOval(240, 250, 30, 30);

    }

    public static void show_frame() {
        JFrame frame = new JFrame("Игральная кость векторная графика");

        frame.setSize(430, 400);
        VectorDice panel = new VectorDice();
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    ;

    public static void main(String[] args) {
        show_frame();

    }
}