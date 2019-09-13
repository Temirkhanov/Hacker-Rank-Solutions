package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for(Character c : s1.toCharArray())
            set.add(c);
        for(Character c : s2.toCharArray())
            if(set.contains(c))
                return "YES";
        return "NO";

    }




}
