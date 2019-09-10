package ModerateProblems;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        int[] array1 = {10, 5, 40};
        int[] array2 = {50, 90, 80};
        System.out.println(findSmallestDifference1(array1, array2));
    }

    private static int findSmallestDifference1(int[] array1, int[] array2) {
        //sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        while (a < array1.length && b < array2.length){
           if (Math.abs(array1[a]-array2[b])<min)
           {
               min = Math.abs(array1[a]-array2[b]);
           }
           if (array1[a]<array2[b]) {
               a++;
           }
           else {
               b++;
           }
       }
        return min;
    }

    private static int findSmallestDifference(int[] array1, int[] array2) {
        int min = Integer.MAX_VALUE;
        int value = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                value = Math.abs(array1[i]-array2[j]);
                if (value<min){
                    min = value;
                }
            }
        }
        return min;
    }
}


