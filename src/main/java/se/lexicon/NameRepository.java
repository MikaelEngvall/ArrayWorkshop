package se.lexicon;

import java.util.Arrays;

/**
 *
 */
public class NameRepository {

    public static void main(String[] args) {

        String[] myArray = new String[3];

        myArray[0] = "Erik";
        myArray[1] = " ";
        myArray[2] = "Svensson";

        for (String word : myArray) {
            System.out.print(word);
        }
        //find("Erik Svensson");
        add("Mikael Engvall");
        // Print the combined array
        for (String word : newArray) {
            System.out.print(word);
        }
    }

    public static String find(final String fullname) {
        String[] n = fullname.split(" ");
        if (n[0].equalsIgnoreCase("Erik") && n[1].equalsIgnoreCase("Svensson")) {
            System.out.println(fullname);
            return fullname;
        } else {
            System.out.println("\nnull");
            return null;
        }
    }

    public static String[] add(final String fullname) {
        // Calculate the length of the new array
        int newLength = 3;
        newLength += 3;
        int i = 0;
        // Create a new array with the combined length
        String[] newArray = new String[newLength];
        for (i, i <= newLength, i++){

        }
            return newArray;
    }

}
