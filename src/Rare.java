import java.util.HashMap;
import java.util.Map;

public class Rare {

    public static int nthMostRare(int[] elements, int n) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            int key = elements[i];
            if (map.containsKey(key)){
                int frequency = map.get(key);
                frequency++;
                map.put(elements[i],frequency);
            }
            else {
                map.put(key,1);
            }
        }

        int count = 0; int rareElement = -1;

        for (Map.Entry<Integer,Integer> val : map.entrySet()) {
            count = val.getValue();
                if (n==count)
                {
                    rareElement = val.getKey();
                    break;
                }
            }
        return rareElement;
    }

    public static void main(String[] args) {
        int x = nthMostRare(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }
}
