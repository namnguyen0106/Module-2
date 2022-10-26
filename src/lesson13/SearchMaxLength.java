package lesson13;

import java.util.ArrayList;
import java.util.List;

public class SearchMaxLength {
    public static void main(String[] args) {
        String demo = "Welcome";
        System.out.println(sort2(demo));
    }

    public static String sort(String str) {
        List<Character> list = new ArrayList<>();
        String newStr = "";
        list.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > list.get(list.size() - 1)) {
                list.add(str.charAt(i));
            }
        }

        for (Character character : list) {
            newStr += character;
        }
        return newStr;
    }

    public static String sort2(String str) {
        String newStr = "";
        newStr += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > newStr.charAt(newStr.length() - 1)) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
