import javax.swing.*;

public class ReturnMethod {
    public static void main(String[] args) {

        double length = Double.parseDouble(JOptionPane.showInputDialog("what is the length?"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("what is the width?"));

       JOptionPane.showMessageDialog(null, "area is: " + area (length,width) + "\nthe perimeter is" + perimeter (length, width));

        System.exit(0);


    }
public static double area(double length, double width){

        return length * width;

}
    public static double perimeter(double length, double width) {return 2 * length * width;}

}
