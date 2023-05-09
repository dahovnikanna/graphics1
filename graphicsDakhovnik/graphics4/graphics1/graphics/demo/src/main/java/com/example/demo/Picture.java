package com.example.demo;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Picture extends JPanel {
    private static final JFrame frame = new JFrame("Игральная кость");

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        try (var in = Picture.class.getResourceAsStream("/Dice.PNG")) {
            assert in != null;
            image = ImageIO.read(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(image, 0, 0, null);

    }

    public static void rasterImage() {
        frame.setSize(300, 315);
        Picture panel = new Picture();
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.add(new Picture());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        rasterImage();
    }
}

