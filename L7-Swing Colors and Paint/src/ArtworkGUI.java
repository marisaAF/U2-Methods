import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;

    public ArtworkGUI()
    {
        frame = new JFrame("Marisa's Artwork");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            setBackground(Color.black);
        }

        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            g.setColor(Color.white);
            g.fillRect(80, 70, 40, 50);

            g.setColor(Color.WHITE);
            g.drawRect(80, 70, 40, 50);

            g.setColor(Color.blue);
            g.fillRect(25, 50, 100, 200);

            g.setColor(Color.BLUE);
            g.drawRect(25, 50, 100, 200);

            g.setColor(Color.blue);
            g.fillRect(200, 50, 100,200);

            g.setColor(Color.BLUE);
            g.drawRect(200, 50, 100, 200);
        }
    }
}
