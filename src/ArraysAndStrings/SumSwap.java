package ArraysAndStrings;

import java.util.HashSet;

public class SumSwap {
    public static void main(String[] args) {
        int[] arrayA = new int[]{4,1,2,1,1,2};
        int[] arrayB = new int[]{3,6,3,3};
        int[] values = sumSwap();
        System.out.println(values[0]+" "+values[1]);
        int[] values1 = findSwapValues(arrayA,arrayB);
        System.out.println(values1[0]+" "+values1[1]);
        int[] values2 = findDifference(arrayA, arrayB);
        System.out.println(values2[0]+" "+values2[1]);
    }

    private static int[] findSwapValues(int[] arrayA, int[] arrayB) {
        int target = getTarget(arrayA, arrayB);
        for (int one : arrayA) {
            for (int two : arrayB) {
                if (one-two==target){
                    int[] values = new int[]{one, two};
                    return values;
                }
            }
        }
    return null;
    }

    private static Integer getTarget(int[] arrayA, int[] arrayB) {
        int sumA = findSum(arrayA);
        int sumB = findSum(arrayB);
        if ((sumA - sumB)%2 != 0) return null;
        return (sumA - sumB)/2;
    }

    private static int[] sumSwap() {
        int[] arrayA = new int[]{4,1,2,1,1,2};
        int[] arrayB = new int[]{3,6,3,3};
        int sumA = findSum(arrayA);
        int sumB = findSum(arrayB);
        for (int one : arrayA) {
            for (int two : arrayB) {
                int newSumA = sumA - one + two;
                int newSumB = sumB - two + one;
                if (newSumA==newSumB){
                    int[] values = new int[]{one, two};
                    return values;
                }
            }
        }
        return null;
    }

    private static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static HashSet getContents(int[] arrayB) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int a : arrayB)
            hashSet.add(a);
        return hashSet;
    }

    private static int[] findDifference(int[] arrayA, int[] arrayB) {
        HashSet<Integer> hashSet = getContents(arrayB);
        for (int one : arrayA){
            int two = one - getTarget(arrayA, arrayB);
            if (hashSet.contains(two)){
                return new int[]{one, two};
            }
        }
        return null;
    }
}
