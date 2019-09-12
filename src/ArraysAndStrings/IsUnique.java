package ArraysAndStrings;

import java.util.Arrays;
import java.util.Hashtable;

public class IsUnique {
    public static void main(String[] args) {
        String str = "Palindrome";
        System.out.println("The string is "+str);
        boolean isUnique = isUniqueString3(str);
        if (isUnique)
            System.out.println("The given string have unique characters");
        else
            System.out.println("The given string does not have unique characters");
    }

    private static boolean isUniqueString3(String str) {
        //the time complexity is O(N Log N)
        char[] charr = str.toCharArray();
        Arrays.sort(charr);
        for (int i = 0; i < charr.length-1; i++) {
            if (charr[i]==charr[i+1])
                return false;
        }
        return true;
    }

    private static boolean isUniqueString2(String str) {
        //this code checks character 0 to 127
        boolean[] charset = new boolean[128];

        if (str.length()>128)
            return false;
        //initially the array is set to false

        //we iterate through each element of string
        //set true at the index equal to the int value of the character.
        // If at any time, we encounter that the array value is already true,
        // it means the character with that int value is repeated.

        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            if (charset[value])
                return false;
            charset[value] = true;
        }
        return true;
        }


    private static boolean isUniqueString1(String str) {
        char[] array = str.toLowerCase().toCharArray();
        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            if (hashtable.containsKey(array[i]))
                return false;
            else
                hashtable.put(array[i],1);
        }
        return true;
    }

    private static boolean isUniqueString(String str) {
        char[] array = str.toLowerCase().toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j])
                    return false;
            }
        }
        return true;
    }
}
