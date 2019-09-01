package Programs;

public class StringManipulation {
    public static void main(String[] args) {
        String name = "yumna is a girl";
        System.out.println("The result of comparing yumna with yumna is " + name.compareTo("yumna"));
        System.out.println("The result of comparing yumna with Yumna is " + name.equalsIgnoreCase("Yumna"));
        System.out.println("The result of matching yumna is a girl with yumna(.*) is " + name.matches("yumna(.*)"));
    }
}
