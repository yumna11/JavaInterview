package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class WordDistance {
    public static void main(String[] args) {
        System.out.println(findDistance());
    }

    private static int findDistance() {
        String document = "you have a large text file containing words. Given any two words, find the shortest distance";
        Map<String, Integer> map = new HashMap<>();
        String[] array = document.split(" ");
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i+1);
        }
        String word1 = "file", word2 = "two";
        int dist1 =0; int dist2 =0;
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            if (value.getKey().equals(word1)){
                 dist1 = value.getValue();
            }
            if (value.getKey().equals(word2)){
                 dist2 = value.getValue();
            }
        }

        return (dist2-dist1-1);

    }
}
