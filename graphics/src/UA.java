import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UA extends JFrame {


    public UA() {
        super("Виды графики");
        super.setBounds(300, 200, 800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.getContentPane().setLayout(null);




        Container container = super.getContentPane();

        /*JPanel panel = new JPanel();

        panel.setVisible(true);

        JLabel label = new JLabel("Игральная кость в трех видах графики");
        panel.add(label);
*/




        JButton vectorBtn = new JButton("Векторная графика");
        vectorBtn.setBounds(70, 450, 200, 30);
        vectorBtn.setBackground(Color.gray);

        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VectorDice vectorDice= new VectorDice();
                vectorDice.show_frame();


            }
        };
        vectorBtn.addActionListener(listener1);



        JButton rastr = new JButton("Растровая графика");
            rastr.setBounds(290, 450, 200, 30);
            rastr.setBackground(Color.gray);

            ActionListener listener2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Picture picture= new Picture();
                    picture.rastimage();
                }
            };
            rastr.addActionListener(listener2);

            JButton volume = new JButton("Объемная графика");
            volume.setBounds(510, 450, 200, 30);
            volume.setBackground(Color.gray);

            ActionListener listener3= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            };


            container.add(vectorBtn);
            container.add(rastr);
            container.add(volume);







        }


    }


