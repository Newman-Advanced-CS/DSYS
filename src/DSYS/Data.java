package DSYS;

/**
 * @author Declan J. Scott
 * */

public class Data {
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
}
