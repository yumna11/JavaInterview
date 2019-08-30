import java.util.Scanner;

public class Primality {
    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        userInput = scanner.nextInt();
        if (isPrime(userInput))
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }

    private static boolean isPrime(int userInput) {
        int sqrt = (int) Math.sqrt(userInput);
        if (userInput==0 || userInput==1)
            return false;
        for (int i=2;i<=sqrt;i++){
            //if the number is divisible, it's not a prime number, e.g. 4%2=0, 4 is not prime
            //we divide the number by all numbers (2 to sqrt value)
            if (userInput%i == 0)
                return false;
        }
        return true;

    }
}
