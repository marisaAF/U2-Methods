import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */

    public static void main(String[] args) {

        JFrame window = new JFrame("Marisa's 3 favorite quotes");

        JPanel panel = new JPanel();
        JButton button = new JButton("My first favorite quote");

        JPanel panel2 = new JPanel();
        JButton button2 = new JButton("My second favorite quote");

        JPanel panel3 = new JPanel();
        JButton button3 = new JButton("My third favorite quote");

        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(button);
        window.add(panel);

        window.setVisible(true);

        button2.addActionListener(new ButtonListener2());

        panel.add(button2);
        window.add(panel2);

        window.setVisible(true);

        button3.addActionListener(new ButtonListener3());

        panel.add(button3);
        window.add(panel3);

        window.setVisible(true);
    }

    private static class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "You don't want to kill yourself but rather something inside you.");
        }
    }

    private static class ButtonListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Something will ALWAYS be better than nothing.");

        }
    }

    private static class ButtonListener3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "The only thing holding back YOUR potential is YOU.");

        }
    }
}