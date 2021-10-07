package DSYS;

/**
 * @author Declan J. Scott
 * */

public class Base {
    public static boolean intIsParsable(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static boolean floatIsParsable(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    // No different from the default print functions, just a simpler syntax
    public static void println(Object output) {
        System.out.println(output);
    }

    public static void print(Object output) {
        System.out.print(output);
    }
}