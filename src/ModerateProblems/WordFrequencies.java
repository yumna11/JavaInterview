package ModerateProblems;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencies {
    public static void main(String[] args) {
        //for single query
        String[] book = {"yumna", "yumna", "is", "a", "good", "girl", "Yumna"};
        System.out.println("The frequency of word yumna is "+getFrequency(book, "yumna"));
        //for repetitive query
        HashMap<String, Integer> table = setUpDictionary(book);
        System.out.println("The frequency of word yumna is "+getFrequency2(table, "yumna"));
    }

    private static int getFrequency2(HashMap<String, Integer> table, String word) {
        if (table == null || word == null) return -1;
        word = word.trim().toLowerCase();
        if (table.containsKey(word))
            return table.get(word);
        return 0;
    }

    private static HashMap<String, Integer> setUpDictionary(String[] book) {
        HashMap<String , Integer> table = new HashMap<>();
        for (String word : book){
            word = word.toLowerCase();
            if (word.trim() != ""){
                if (table.containsKey(word))
                    table.put(word, table.get(word)+1);
                else
                 table.put(word, 1);
            }
        }
        return table;
    }

    private static int getFrequency(String[] book, String word) {
        int count = 0;
         word = word.trim().toLowerCase();
        for (String val: book) {
            if (val.trim().toLowerCase().equals(word)){
                count++;
            }
        }
        return count;
    }
}
