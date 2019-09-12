package ArraysAndStrings;

import java.lang.reflect.Array;

public class URLify {
    public static void main(String[] args) {
        String str = "Mr John Smith      ";
        urlify(str,13);
        replaceSpaces(str.toCharArray(), 13);
    }

    private static void replaceSpaces(char[] chars, int length) {
        int space = 0, index, i=0;
        for (i = 0; i < length; i++) {
            if (chars[i] == ' ')
                space++;
        }
        index = length + space * 2;
       if (length < chars.length) chars[length] = '\0'; //end array

        for (i = chars.length-1; i >= 0 && index >= 1; i--) {
            if (chars[i] == ' '){
                chars[index-1] = '0';
                chars[index-2] = '2';
                chars[index-3] = '%';
                index = index - 3;
            }else {
                chars[index-1] = chars[i];
                index--;
            }
        }
    }


    private static void urlify(String str, int length) {
        System.out.println(str.trim().replaceAll(" ","%20"));
    }
}
