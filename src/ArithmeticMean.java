public class ArithmeticMean {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println("The array value is "+array[i]);
        }
        double mean = sum/array.length;
        System.out.println("The mean is "+mean);

    }
}
