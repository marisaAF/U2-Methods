import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    /*
    1. Set up my window
    2. Set up my text fields
    3. Set up my buttons
    4. Set up my results label
    5. Display results
     */

    static JTextField Number1, Number2;
    static JLabel resultLabel;

    public static void main(String[] args) {

        JFrame window = new JFrame("A Simple Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel = new JLabel("Enter your first number here: ");
        JLabel inputLabel2 = new JLabel("Enter your second number here: ");
        Number1 = new JTextField(10);
        Number2 = new JTextField(10);

        JButton subButton = new JButton("subtract");
        JButton multiplyButton = new JButton("multiply");
        JButton addButton = new JButton("add");
        JButton divisionButton = new JButton("division");

        resultLabel = new JLabel("0.00");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        addButton.addActionListener(new addListener());
        subButton.addActionListener(new addListener());
        multiplyButton.addActionListener(new addListener());
        divisionButton.addActionListener(new addListener());

        panel.add(inputLabel);
        panel.add(Number1);
        panel.add(inputLabel2);
        panel.add(Number2);

        panel.add(resultLabel);

        panel.add(subButton);
        panel.add(multiplyButton);
        panel.add(addButton);
        panel.add(divisionButton);

        window.add(panel);
        window.setVisible(true);

    }
    private static class addListener implements ActionListener{

        /*
        1. Get input - from text fields
        2. Add the numbers
        3. Output to the result label
         */

        public void actionPerformed(ActionEvent e){
            double number1 = Double.parseDouble(Number1.getText());
            double number2 = Double.parseDouble(Number2.getText());

            resultLabel.setText(String.valueOf(number1 + number2));
        }
    }

    private static class multiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double number1 = Double.parseDouble(Number1.getText());
            double number2 = Double.parseDouble(Number2.getText());

            resultLabel.setText(String.valueOf(number1 * number2));
        }
    }

    private static class subListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double number1 = Double.parseDouble(Number1.getText());
            double number2 = Double.parseDouble(Number2.getText());

            resultLabel.setText(String.valueOf(number1 - number2));
        }
    }

    private static class divisionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double number1 = Double.parseDouble(Number1.getText());
            double number2 = Double.parseDouble(Number2.getText());

            resultLabel.setText(String.valueOf(number1 / number2));
        }
    }
}
