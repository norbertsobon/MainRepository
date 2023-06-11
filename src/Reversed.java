import java.lang.reflect.Array;
import java.util.Arrays;

public class Reversed {
    public static int[] digitize(long n) {
        String longToString = String.valueOf(n);
        StringBuilder sb = new StringBuilder(longToString);
        sb.reverse();
        longToString = sb.toString();
        System.out.println(longToString);
        int[] reversedLongToArray = new int[longToString.length()];
        for(int i = 0; i< longToString.length(); i++){
            reversedLongToArray[i] = longToString.charAt(i) - '0';
        }
        return reversedLongToArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(123456789)));

    }
}
