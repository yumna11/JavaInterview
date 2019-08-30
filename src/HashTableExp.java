import java.util.Hashtable;

public class HashTableExp {



    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("Yumna","age is 22");
        hashtable.put("Humna","age is 25");
        hashtable.put("Usman","age is 26");
        hashtable.put("Humza","age is 27");

        System.out.println("" + hashtable.get("Yumna"));

    }
}
