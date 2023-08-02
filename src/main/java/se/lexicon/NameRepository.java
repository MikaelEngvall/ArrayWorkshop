package se.lexicon;

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
        find("Erik Svensson");
        add("Mikael Engvall");
        // Print the combined array


        System.out.println(add("Erik Svensson"));
        System.out.println(add("Mikael Engvall"));
}

    public static String find(final String fullname) {
        String[] n = fullname.split(" ");
        for (int i = 0; i <= 3; i++) {
            if (n[0].equalsIgnoreCase("Erik") && n[1].equalsIgnoreCase("Svensson")) return fullname;
            else
                return null;
        }
        return fullname;
    }
    public static boolean add(final String fullname) {

        if (find(fullname) != null) {
            return false;
        }

        String[][] nameBase = {
                {"Erik", " ", "Svensson"},
                {null, null, null},
        };
        String firstName = fullname.substring(0, fullname.indexOf(" "));
        String blank = " ";
        String lastName = fullname.substring(fullname.indexOf(" ") + 1);
        nameBase[1][0] = firstName;
        nameBase[1][1] = blank;
        nameBase[1][2] = lastName;

        return true;
    }

}
