import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DeleteFirstAndLast{
        public static String remove(String str) {
            char[] list = str.toCharArray();
            list = Arrays.copyOfRange(list,1,list.length -1);
            String listCharRemove = Arrays.toString(list);
            listCharRemove = listCharRemove.replace(",", "");
            listCharRemove = listCharRemove.replace(" ", "");
            listCharRemove = listCharRemove.replace("[", "");
            listCharRemove = listCharRemove.replace("]", "");
            listCharRemove.trim();
            return listCharRemove;
        }

    public static void main(String[] args) {
        System.out.println(remove("siemano"));

    }
}
