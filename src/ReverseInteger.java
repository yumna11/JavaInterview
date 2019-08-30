import java.util.ArrayList;

public class ReverseInteger {
    public static void main(String[] args) {
        reverseValue(123);
    }

    private static void reverseValue(int value) {
        int reverse = 0;
        while (value > 0){
            reverse = reverse * 10;
            reverse = reverse + (value%10);
            value = value/10;
        }
        System.out.print(reverse);
    }
}
