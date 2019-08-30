import java.util.Arrays;
import java.util.Collection;

public class Tx_R_ArithmeticMean {

    public static double getAverage(Collection<Integer> inputArray) {
        int sum = 0;
        Integer[] array = inputArray.toArray(new Integer[inputArray.size()]);
        for (int i = 0; i < inputArray.size(); i++) {
            sum = sum + array[i];
        }
        double mean = sum/array.length;
        return mean;
    }

    public static void main(String[] args) {
        System.out.println(getAverage(Arrays.asList(2, 1, 3, 8, 1)));
    }

}