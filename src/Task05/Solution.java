package Task05;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) {
        String s = "я ты он она семья";
        String[] words = s.split(" ");

        String[] words2 = toUpp(words);

        List<String> list = Arrays.asList(words2);

        Comparator<String> comparator = (String o1, String o2)->
                countsVowels(o2) - countsVowels(o1);

        Collections.sort(list,comparator);
        System.out.println(Arrays.toString(words2));
    }

    public static String[] toUpp (String[] words){
        String[] words2 = new String[words.length];
        Pattern pattern = Pattern.compile("[аяоуеёиыэю]");

        for(int i = 0; i< words.length; i++) {
            Matcher matcher = pattern.matcher(words[i]);

            while (matcher.find()) {
                words2[i] = words[i].replace(words[i].charAt(matcher.start()) + "", Character.toUpperCase(words[i].charAt(matcher.start())) + "");
                break;
            }
        }
        return words2;
    }
    public static int countsVowels (String s){
        int n = 0;
        Pattern pattern = Pattern.compile("[аяоуеёиыэю]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            n++;
        }
        return n;
    }
}


