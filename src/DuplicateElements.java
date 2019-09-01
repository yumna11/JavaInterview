import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
    //find duplicate elements in an array
    public static void main(String[] args) {
        findDuplicate();
        findDuplicate1();
    }

    private static void findDuplicate1() {
        int[] array = {4, 2, 4, 5, 2, 3, 1};
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            if (map.containsKey(currentValue)){
                count++;
                map.put(currentValue,count);
            }else {
                map.put(currentValue,1);
            }
        }
       for (Map.Entry<Integer, Integer> val : map.entrySet()){
            if (val.getValue()>1){
                System.out.println("Duplicate value is "+ val.getKey());
            }
       }

    }

    private static void findDuplicate() {
        int[] array = {4, 2, 4, 5, 2, 3, 1};
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j])
                {
                    System.out.println("Duplicate element is "+array[i]);
                }

            }

        }
    }
}
