import org.w3c.dom.css.Rect;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VectorDice extends JPanel {

    private static final int SIZE = 200;

    public void paint(Graphics g) {
        super.paint(g);

// Основа кости-прямоугольник
        g.setColor(Color.BLACK);
        g.drawRect(100,100, SIZE, SIZE);
// Кругляшки
        g.fillOval(140, 140, 30, 30);
        g.fillOval(180, 190, 30, 30);
        g.fillOval(140, 240, 30, 30);
        g.fillOval(220, 140, 30, 30);
        g.fillOval(220, 240, 30, 30);

    }

    public static void show_frame() {
        JFrame frame = new JFrame("Игральная кость векторная графика");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        VectorDice panel = new VectorDice();
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    };

    public static void main(String[] args) {
        show_frame();

    }
}