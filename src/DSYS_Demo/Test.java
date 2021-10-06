package DSYS_Demo;

import DSYS.*;

/**
 * @author Declan J. Scott
 * */

// Demo of all DSYS functions
public class Test {
    public static void main(String[] args) {
        // Different Input Functions
        String inStr = Input.getString("string: ");
        System.out.println(inStr);

        int inInt = Input.getInt("int: ");
        int inInt2 = Input.getInt("int 2: ");
        System.out.println("Sum = " + (inInt + inInt2));

        float inFloat = Input.getFloat("float: ");
        System.out.println(inFloat);

        char inChar = Input.getChar("char: ");
        System.out.println(inChar);

        boolean inBool = Input.getBool("bool (y/n): ", 'y', 'n');
        System.out.println(inBool);

        // Reading/Writing/Appending files
        String fileContents = IO.read("src/DSYS_Demo/readTest.txt");
        System.out.println(fileContents);

        String writeFile = "src/DSYS_Demo/writeTest.txt";
        IO.write(writeFile, inStr);

        String appendText = Input.getString("append: ");
        IO.append(writeFile, appendText);
    }
}
