package Zadanie7;

public class zadanie7 {
    public static String rev(String str) {
        if ( str.length() <= 1) {
            return str;
        }
        return rev(str.substring(1)) + str.charAt(0);
    }
}
