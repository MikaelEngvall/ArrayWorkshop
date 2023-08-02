package se.lexicon;

/**
 *
 */
public class App {

    public static void main(String[] args) {

        String[] myArray = new String[3];

        myArray[0] = "Erik";
        myArray[1] = " ";
        myArray[2] = "Svensson";

        for (String word : myArray) {
            System.out.print(word);
        }
        //find("Erik Svensson");
        addName("Mikael Engvall");
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
//names.add(fullName);
    public static String addName(final String fullname) {
        String[][] nameBase = new String[][]{};
        String[] n = fullname.split(" ");
        for (int i = 0; i < (nameBase.length); i++) { // i is colums
            if (nameBase[0][i] == null) {
                for (int j = 0; j < 2; j++) { // j is rows
                    if (j % 2 != 0) nameBase[j][i] = n[j];
                    else {
                        nameBase[j][i] = n[j];
                        System.out.println(nameBase[j][i]);
                    }
                    //System.out.println(nameBase[j][i]);
                }
            }
            System.out.println("\n");
        }
        return fullname;
    }
}
