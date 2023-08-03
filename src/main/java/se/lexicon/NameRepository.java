package se.lexicon;

public class NameRepository {

    // Array containing the components of the full name
    private static String[] myArray = {"Erik", " ", "Svensson", "Per", " ", "Svensson"};

    public static void main(String[] args) {
        String fullName1 = "Erik Svensson";
        String fullName2 = "John Doe";
        String[] fullNameSplit = fullName1.split(" ");
        String firstName = fullNameSplit[0];
        String lastName = fullNameSplit[1];
        System.out.println(firstName);
        System.out.println(find(fullName1));
        System.out.println(find(fullName2));
        System.out.println(add(fullName1));
//        System.out.println(add(fullName2));

        String[] s = findByFirstName(firstName);
        for (String element : s) System.out.println(element);
        System.out.println("----------------");
        String[] s2 = findByLastName(lastName);
        for (String element : s2) System.out.println(element);
        System.out.println("----------------");
        for (String string : myArray) System.out.println(string);
        System.out.println(update(fullName1, fullName2));
    }
    public static boolean update(final String original, final String updatedName) {
        String[] originalNameParts = original.split(" ");
        String[] updatedNameParts = updatedName.split(" ");

        // Ensure both original and updated names contain both a first name and a last name
        if (originalNameParts.length != 2 || updatedNameParts.length != 2) {
            return false;
        }

        // Find the indices of the original first name and last name in myArray
        int firstNameIndex = -1;
        int lastNameIndex = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equalsIgnoreCase(originalNameParts[0])) {
                firstNameIndex = i;
            }
            if (myArray[i].equalsIgnoreCase(originalNameParts[1])) {
                lastNameIndex = i;
            }
        }

        // Return false if the original first name or last name is not found in myArray
        if (firstNameIndex == -1 || lastNameIndex == -1) {
            return false;
        }

        // Check if the updated first name and last name already exist in myArray
        for (int i = 0; i < myArray.length - 1; i++) {
            if (i != firstNameIndex && i != lastNameIndex) {
                if (myArray[i].equalsIgnoreCase(updatedNameParts[0]) && myArray[i + 1].equalsIgnoreCase(updatedNameParts[1])) {
                    return false; // An existing first name and last name matching the updatedName already exists
                }
            }
        }

        // Update the first name and last name with the new values
        myArray[firstNameIndex] = updatedNameParts[0];
        myArray[lastNameIndex] = updatedNameParts[1];

        return true;
    }
    public static String[] findByLastName(final String lastName) {
        int k = 0;
        for (String component : myArray) {  // Checking and counting occurrences of the string
            if (lastName.equalsIgnoreCase(component)) {
                k++;
            }
        }

        String[] result = new String[k];    // Setting array's length according to occurrences
        k = 0;
        for (String component : myArray) {
            if (lastName.equalsIgnoreCase(component)) {
                result[k] = component;
                k++;
            }
        }

        return result;
    }
    public static String[] findByFirstName(final String firstName) {
        int k = 0;
        for (String component : myArray) {  //Checking and counting occurencies of the string
            if (firstName.equalsIgnoreCase(component)) {
                k++;
            }
        }
        String[] result = new String[k];    //Setting array's length according to occurencies
        k = 0;
        for (String component : myArray) {
            if (firstName.equalsIgnoreCase(component)) {
                result[k] = component;
                k++;
            }
        }
        return result;
    }


    public static String find(final String fullName) {
        // Split the input full name into parts using whitespace as the delimiter
        String[] nameParts = fullName.split(" ");

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
        String[] nameParts = fullName.split(" ");

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

        System.arraycopy(myArray, 0, newArray, 0, myArray.length);
        if (newLength - myArray.length >= 0)
            System.arraycopy(nameParts, myArray.length - myArray.length, newArray, myArray.length, newLength - myArray.length);
        myArray = newArray;

        return true;
    }
}
