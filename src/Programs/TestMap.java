package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        map.put("a", arrayList);
        System.out.println(map.get("a"));
        map.remove("a");

        Map<String, List<Integer>> map1 = new HashMap<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        map1.put("a", arrayList1);
        System.out.println(map1.get("a"));
        arrayList1.add(3);
    }
}
