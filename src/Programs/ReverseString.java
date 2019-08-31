package Programs;

public class ReverseString {

    public static void main(String[] args) {
        reverseString("yumna");
    }

    private static void reverseString(String str) {
        char[] strArray = str.toCharArray();
        StringBuilder result = new StringBuilder(strArray.length);

        for (int i=strArray.length-1;i>=0;i--) {
            result.append(strArray[i]);
        }
        System.out.println("The reverse string is " + result);
    }
}
