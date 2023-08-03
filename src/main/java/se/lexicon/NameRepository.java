package se.lexicon;
public class NameRepository {

    // Array containing the components of the full name
    private static String[] myArray = {"Erik", " ", "Svensson"};

    public static void main(String[] args) {
        String fullName1 = "Erik Svensson";
        String fullName2 = "John Doe";

        System.out.println(find(fullName1));
        System.out.println(find(fullName2));
        System.out.println(add(fullName1));
        System.out.println(add(fullName2));
    }
    public static String find(final String fullName) {
        // Split the input full name into parts using whitespace as the delimiter
        String[] nameParts = fullName.split("\\s+");

        // Check if both first name and last name are present in myArray
        boolean firstNameFound = false;
        boolean lastNameFound = false;

        for (String namePart : nameParts) {
            for (String component : myArray) {
                if (namePart.equals(component)) {
                    if (component.equals(" ")) {
                        continue; // Ignore the space component
                    } else if (!firstNameFound) {
                        firstNameFound = true;
                    } else {
                        lastNameFound = true;
                    }
                }
            }
        }

        // If both first name and last name are found, return the full name
        if (firstNameFound && lastNameFound) {
            return fullName;
        }

        // Otherwise, return null
        return null;
    }
    public static boolean add(final String fullName) {
        // Split the input full name into parts using whitespace as the delimiter
        String[] nameParts = fullName.split("\\s+");

        // Check if both first name and last name are present in myArray
        boolean firstNameFound = false;
        boolean lastNameFound = false;

        for (String namePart : nameParts) {
            for (String component : myArray) {
                if (namePart.equals(component)) {
                    if (component.equals(" ")) {
                        continue; // Ignore the space component
                    } else if (!firstNameFound) {
                        firstNameFound = true;
                    } else {
                        lastNameFound = true;
                    }
                }
            }
        }

        if (firstNameFound && lastNameFound) {
            return false;
        }

        // If not found, add each part of the full name to the array
        int newLength = myArray.length + nameParts.length;
        String[] newArray = new String[newLength];

        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        for (int i = myArray.length; i < newLength; i++) {  //Here I must put a " " between the
            newArray[i] = nameParts[i - myArray.length];    //firstname and lastname
        }

        myArray = newArray;

        return true;
    }
}
