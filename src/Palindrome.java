import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter string to check: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println( isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        StringBuilder result = new StringBuilder();
        for (int i=input.length()-1;i>=0;i--){
            char c = input.charAt(i);
            result.append(c);
        }
        if (input.equalsIgnoreCase(result.toString()))
            return true;
        else
            return false;
    }
}
