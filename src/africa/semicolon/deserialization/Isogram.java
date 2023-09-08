package africa.semicolon.deserialization;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Isogram {
    private final String ISOGRAM_ALPHABETS="abcdefghijklmnopqrstuvwxyz";
    public boolean check(String input) {
//        int occurrence = 0;
        String regex = "[^a-zA-Z0-9]";
        String result = input.replaceAll(regex, "");
//        if (result.length() < ISOGRAM_ALPHABETS.length()) return false;
//        for (int index = 0; index < result.length(); index++) {
//            for (int index1 = 0; index1 < ISOGRAM_ALPHABETS.length(); index1++) {
//                if (result.toLowerCase().charAt(index) == ISOGRAM_ALPHABETS.charAt(index1)) occurrence++;
//            }
//        }
        Set<String> wordsInput = new HashSet<>();
        for (int index = 0; index < result.length(); index++) {
            wordsInput.add(String.valueOf(result.charAt(index)));
        }
//        return occurrence == ISOGRAM_ALPHABETS.length();
        return wordsInput.size() == 26;
    }
}
