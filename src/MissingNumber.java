import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        missingNumber();
        missingNum();
    }

    private static void missingNum() {
        //Find the sum of n number using formula n=n*(n+1)/2
        //Find the sum of elements present in given array.
        //Substract (sum of n numbers – sum of elements present in the array)
        int sum = 0;
        int[] arr1={7,5,6,1,4,2};
        int n = arr1.length + 1;
        sum = n * (n+1)/2;
        int restSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            restSum += arr1[i];
        }
        System.out.println("The missing value is "+ (sum-restSum));
    }

    private static void missingNumber() {
        //this method uses a different approach
        int[] array = {1,2,5,4,7,6};
        Arrays.sort(array);
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp!=array[i]) {
                System.out.println("Missing value is " + temp);
                break;
            }
            temp++;
        }
    }
}
