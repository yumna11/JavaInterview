import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max value ");
        max = scanner.nextInt();
        sieveOfEratosthenes(max);
    }

    private static void sieveOfEratosthenes(int max) {
        //create a boolean array and assigns all elements with true value
        //if value is false, then the number at index is not prime
        boolean[] prime = new boolean[max+1];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int p = 2; p*p <=max ; p++) {
            if (prime[p] == true)
            {
                //update all multiples of p
                for (int i = p*p; i <= max ; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <=max ; i++) {
            if (prime[i]==true)
                System.out.println("Number " + i + " is a prime number.");

        }
    }
}
