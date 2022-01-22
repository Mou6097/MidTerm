package string.problems;

import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        Set<Integer> large = wordLength.keySet();
        int val = Collections.max(large);
        System.out.println("The word with max length is : " + wordLength.get(val));
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] words = wordGiven.split("\\s");
        for(int i = 0; i < words.length; i++) {
            map.put(words[i].length(), words[i]);
        }
        return map;

    }
}
