import java.util.ArrayList;

public class Cezar {

    private String Caesar(String input, int number, String method){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        String result = "";

        if(method == "decrypt"){
            number = -number;
        }

        for(char i = 'a'; i <= 'z'; i++){
            alphabet.add(i);
        }

        for(int i = 0; i < input.length(); i++){
            char letter;
            for(int j = 0; j < alphabet.size(); j++){
                if(alphabet.get(j).equals(input.charAt(i))){
                    if(j+number < 0){
                        letter = alphabet.get(j+number + alphabet.size());
                        result += letter;
                    }else if(j+number >= alphabet.size()){
                        letter = alphabet.get(j+number - alphabet.size());
                        result += letter;
                    }else{
                        letter = alphabet.get(j+number);
                        result += letter;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Cezar obiekt = new Cezar();
        String zmienna = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";

        System.out.println(obiekt.Caesar("qnuuxfxaum", 9, "decrypt"));
    }
}
