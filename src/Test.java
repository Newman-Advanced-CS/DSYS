import DSYS.*;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        String inStr = Input.getString("string: ");
        System.out.println(inStr);

        int inInt = Input.getInt("int: ");
        System.out.println(inInt);

        char inChar = Input.getChar("char: ");
        System.out.println(inChar);

        boolean inBool = Input.getBool("bool (y/n): ", 'y', 'n');
        System.out.println(inBool);

        String fileContents = IO.read("src/readTest.txt");
        System.out.println(fileContents);

        IO.write("src/writeTest.txt", inStr);
    }
}
