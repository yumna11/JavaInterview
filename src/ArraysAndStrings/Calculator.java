package ArraysAndStrings;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        System.out.println(2*3+5/6*3+15);
        System.out.println(isPalindrome("level"));
    }

    public static boolean isPalindrome(String word) {
        char[] array = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=array.length-1; i>=0; i--) {
            stringBuilder.append(array[i]);
        }
        if (stringBuilder.toString().equalsIgnoreCase(word))
            return true;
        else
            return false;
    }
}
