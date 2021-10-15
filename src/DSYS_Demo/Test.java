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
        Base.println(inStr);

        int inInt = Input.getInt("int: ");
        int inInt2 = Input.getInt("int 2: ");
        Base.println("Sum = " + (inInt + inInt2));

        float inFloat = Input.getFloat("float: ");
        Base.println(inFloat);

        char inChar = Input.getChar("char: ");
        Base.println(inChar);

        boolean inBool = Input.getBool("bool (y/n): ", 'y', 'n');
        Base.println(inBool);

        Base.changeColor(Colors.TEXT_GREEN);

        // Reading/Writing/Appending files
        String fileContents = IO.read("src/DSYS_Demo/readTest.txt");
        Base.println(fileContents);

        Base.changeColor(Colors.TEXT_RESET);

        String writeFile = "src/DSYS_Demo/writeTest.txt";
        IO.write(writeFile, inStr);

        String appendText = Input.getString("append: ");
        IO.append(writeFile, appendText);

        String pathCheck = Input.getString("does this path exist: ");
        Base.println(IO.fileExists(pathCheck));
    }
}
