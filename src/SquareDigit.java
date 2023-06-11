public class SquareDigit {

    public int squareDigits(int n) {
        char[] nArrayChar = String.valueOf(n).toCharArray();
        int[] nArrayInt = new int[nArrayChar.length];
        int[] result = new int[nArrayChar.length];
        for(int i = 0; i < nArrayChar.length; i++){
            nArrayInt[i] = Character.getNumericValue(nArrayChar[i]);
        }
        for(int i = 0; i < nArrayChar.length; i++){
            result[i] = (int)Math.pow(Double.valueOf(nArrayInt[i]),2);
        }
        String concat = "";
        for(int i = 0; i < result.length; i++){
            concat += result[i];
        }
        return Integer.parseInt(concat);
    }
}