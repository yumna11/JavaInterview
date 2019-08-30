import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        int x = nthMostRare(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 4);
        System.out.println(x);
    }
    public static int nthMostRare(int[] elements, int n) {
        Map<Integer, Integer> counted = new HashMap<>();
        for (int i : elements) {
            if (counted.containsKey(i)) {
                counted.put(i, counted.get(i) + 1);
            } else {
                counted.put(i, 1);
            }
        }
        Map<Integer, Integer> sortedMap =
                counted.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
        List<Integer> occurrences =
                sortedMap.entrySet().stream()
                        .map(Map.Entry::getValue)
                        .distinct().collect(Collectors.toList());
        Optional<Integer> answer =
                sortedMap.entrySet().stream()
                        .map(Map.Entry::getValue)
                        .filter(v -> v.intValue() == occurrences.get(n - 1)).findFirst();
        return answer.get();
    }
    }
