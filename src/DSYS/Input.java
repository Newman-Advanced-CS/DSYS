package DSYS;
import java.util.Scanner;

/**
 * @author Declan J. Scott
 * */

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean intIsParsable(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static String getString(String prompt)
    {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInt(String prompt)
    {
        int result = 0;
        boolean gotInt = false;
        do {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if(intIsParsable(input))
            {
                result = Integer.parseInt(input);
                gotInt = true;
            }
        }
        while(!gotInt);
        return result;
    }

    public static char getChar(String prompt)
    {
        System.out.print(prompt);
        return scanner.next().charAt(0);
    }

    public static boolean getBool(String prompt, char t, char f)
    {
        do {
            char input = Character.toUpperCase(getChar(prompt));
            if(input == Character.toUpperCase(t))
            {
                return true;
            } else if (input == Character.toUpperCase(f))
            {
                return false;
            }
        }
        while(true);
    }
}