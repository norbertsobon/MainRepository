public class Troll {
    public static String disemvowel(String str) {
        String[] array = str.split("");
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < vowels.length; j++){
                if(array[i].equals(vowels[j])){
                    array[i] = "";
                }
            }
        }
        String result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i];
        }


        return result;
    }

    public static void main(String[] args) {
        if(Troll.disemvowel("This website is for losers LOL!").equals("Ths wbst s fr lsrs LL!")){
            System.out.println("Passed");
        }else{
            System.out.println("You are fucking idiot");
            System.out.println("Result is: " + Troll.disemvowel("This website is for losers LOL!"));
        }
    }
}