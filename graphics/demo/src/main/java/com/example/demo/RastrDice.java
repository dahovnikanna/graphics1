package com.example.demo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class RastrDice extends JPanel {

    private static final int SIZE = 100;
    private static final String FILENAME = "dice.png";


    public static void show_frame2() {
        // Создать новое изображение с заданными размерами и типом
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        // Получить объект Graphics для рисования на изображении
        Graphics g = image.getGraphics();
        Image img = new ImageIcon("res/Dice.PNG").getImage();
        g.drawImage(img, (int) 0, (int) 0, null);
        // Нарисовать кость
        g.setColor(Color.BLACK);
        g.drawRect(10, 10, SIZE, SIZE);
        // Нарисовать круглишки
        g.fillOval(20, 20, 15, 15);
        g.fillOval(51, 55, 15, 15);
        g.fillOval(20, 85, 15, 15);
        g.fillOval(85, 20, 15, 15);
        g.fillOval(85, 85, 15, 15);
        // Сохранить изображение в файл

        try {
            ImageIO.write(image, "png", new File(FILENAME));
            System.out.println("Изображение сохранено в файл " + FILENAME);
        } catch (Exception e) {
            System.out.println("Ошибка при сохранении изображения: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        show_frame2();

    }
}
