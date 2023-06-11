import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {
        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(Kata.highAndLow("5 2 7 4 2 7 3 6 9"));
    }
}