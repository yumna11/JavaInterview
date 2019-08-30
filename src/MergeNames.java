import java.util.ArrayList;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        ArrayList<String> uniqueArray = new ArrayList<>();

        for (int i = 0; i < names1.length; i++) {
            if (!uniqueArray.contains(names1[i])) {
                uniqueArray.add(names1[i]);
            }
        }
        for (int i = 0; i < names2.length; i++) {
            if (!uniqueArray.contains(names2[i])) {
                uniqueArray.add(names2[i]);
            }
        }
        String[] array = uniqueArray.toArray(new String[uniqueArray.size()]);
        return array;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}