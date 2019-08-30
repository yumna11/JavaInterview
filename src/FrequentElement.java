import com.sun.javafx.collections.MappingChange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequentElement {
    public static void main(String[] args) {
        int[] arr = {1,22,22,34,5,6,5,7,5};
        System.out.println("The fre element is = " + mostFrequent(arr, arr.length) + "");
    }

    private static int mostFrequent(int[] arr, int length) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int key = arr[i];
            if (map.containsKey(key)){
                int frequency = map.get(key);
                frequency++;
                map.put(arr[i],frequency);
            }
            else {
                map.put(key,1);
            }
        }

        int maxCount = 0; int frequentElement = -1;
        for (Map.Entry<Integer,Integer> val : map.entrySet()) {
            if (maxCount<val.getValue()){
                frequentElement = val.getKey();
                maxCount = val.getValue();
            }
        }
        return frequentElement;
    }
}
