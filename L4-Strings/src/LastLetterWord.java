import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */
/*
1.get the input - the 3 words
2.Isolate the last 3 letters of each word
3.Combine the last 3 letters of all the words
4.output results
 */
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Enter name 1: ");
        String name2 = JOptionPane.showInputDialog("Enter name 2: ");
        String name3 = JOptionPane.showInputDialog("Enter name 3: ");

       String output = lastThree(name1) + lastThree(name2) + lastThree(name3);

        JOptionPane.showMessageDialog(null, output);
    }

    public static String lastThree(String name) {

        String newName;

        if(name.length() <=3) {
            newName = name;
        }else{
            newName = name.substring(name.length()-3);
        }
        return newName;
    }
}
