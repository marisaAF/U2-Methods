import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
    1.Get input - The word which includes a word with a p and 3 letters after it
    2.Isolate the length/location of the p and the 3 letters after it
    3.use a return method to return p + the 3 letters after
    4.output results
     */

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a name with a P that also has 3 letters after, for example Hippopotamus: ");

        JOptionPane.showMessageDialog(null, splitP(word));

        System.exit(0);
    }

    public static String splitP(String word){
        int pIndex = word.indexOf('p');

        String split = word.substring(pIndex, pIndex + 4);

        return split;
    }
}
