package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        checkPermutation("abc  ","cba");
        boolean isPermutation = permutation("cba", "abc");
        System.out.println("Are given strings permutable: "+isPermutation);
    }

    private static String sort(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    private static boolean permutation(String str1, String str2) {
        if (str1.length()!=str2.length())
            return false;
        return sort(str1).equals(str2);
    }

    private static void checkPermutation(String str1, String str2) {
        int j=0;
        if (str1.length()!=str2.length())
            System.out.println("not a permutation");
        for (int i = str1.length()-1; i >= 0; i--) {
            if (str1.charAt(i)==str2.charAt(j))
                j++;
            else{
                System.out.println("not a permutation");
                break;
            }
        }
        if (j==str1.length())
            System.out.println("A permutation");
    }
}
