package Hashmaps;

import java.util.HashMap;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> words = new HashMap<>();
        int c = 1;
        for(String word : magazine){
            if(words.containsKey(word))
                c += words.get(word);
            words.put(word, c);
        }
        for(String word : note){
            if(!words.containsKey(word)){
                System.out.println("No");
                return;
            }
            c = words.get(word)-1;
            if(c < 1)
                words.remove(word);
            else
                words.put(word, c);
        }
        System.out.println("Yes");

    }

}
