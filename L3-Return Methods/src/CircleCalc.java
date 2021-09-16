import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    /*
    1. Get input - get the radius
    2. calculate area
    3. calculate circumference
    4. display results
     */

    public static void main(String[] args) {

        //create and run the program
        //1.
        double radius = getInput("Please enter the radius");

        //2.
        double area = area(radius);

        //3.
        double circumference = circumference(radius);

        //4.
        JOptionPane.showMessageDialog(null, displayResults(area, circumference));
    }
    //method to get input from user
    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area (double radius){

    return Math.pow(radius, 2) * Math.PI;

}

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius){

        return 2 * Math.PI * radius;

    }

    public static String displayResults(double area, double perimeter){

        DecimalFormat round = new DecimalFormat("#.00");
        String message = "The area is: " + area;
        message += "\nThe circumference is: " + round.format(perimeter);

        return message;
    }
}
