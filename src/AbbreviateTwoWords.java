public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] splitedName = name.split(" ");
        return Character.toUpperCase(splitedName[0].toCharArray()[0]) + "." + Character.toUpperCase(splitedName[1].toCharArray()[0]);
    }
}