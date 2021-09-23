import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {
        String name = "Hephaestus";
        String greeting = "Hello";

        //Style1
        int stringSize = name.length();
        System.out.println(name + " had " + stringSize + " letters.");

        //Style 2
        System.out.println(name + " has " + name.length() + " letters.");

        System.out.println(name + " has " + greeting.length() + " letters.");

        //Creat a program which capitalizes the first letter of a name.

        //Attempt 1
        //Plan
        // 1. Get Input
        // 2. Isolate first letter
        // 3. Capitalize the first letter
        // 4. Isolate the rest of the letters
        // 5. Put 3 and 4 together
        //6. Display Results

        System.out.println(capFirst(name));

    }

    public static String capFirst(String name){

        String letter = name.substring(0, 1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);

    }
}
