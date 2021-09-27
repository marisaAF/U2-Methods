import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class FeetToMeters {

    /*
    1.Create GUI
    2.Get Input, when a button is clicked
    3.The Math - 3.28 Feet in a Meter.
    F->M = DIVIDE by 3.28
    M->F = MULTIPLY by 3.28
    4.
     */

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */


    public static void main(String[] args) {

        JFrame window = new JFrame("Convert your distances!!");
        JPanel panel = new JPanel();
        JButton feetToMeters = new JButton("Enter a distance in feet to convert it into meters!!");
        JButton metersToFeet = new JButton("Enter a distance in meters to convert it into feet!!");

        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(metersToFeet);
        panel.add(feetToMeters);

        window.add(panel);
        window.setVisible(true);
    }
        private static class ButtonA implements ActionListener {

            public void actionPerformed(ActionEvent e) {

            }
        }

    private static class FeetToMetersListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number =  Double.parseDouble(JOptionPane.showInputDialog("Enter the feet"));
            double result = number / 3.28;
            JOptionPane.showMessageDialog(null, result + "in meters.");
        }
    }
    private static class MetersToFeetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the Meters"));
            double result = number * 3.28;
            JOptionPane.showMessageDialog(null, result + "in feet.");
        }
    }
}
