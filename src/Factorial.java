import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        userInput = scanner.nextInt();
        factorial(userInput);
        System.out.println("Using recursive approach "+factorialRec(userInput));
        System.out.println("Using ternary approach "+factorialTer(userInput));

    }

    //iterative approach
    private static void factorial(int userInput) {
        int factorial = 1;
        while (userInput >= 1) {
            factorial *= userInput;
            userInput--;
        }
        System.out.println("The factorial of number is " + factorial);
    }

    //recursive approach
    private static int factorialRec(int userInput){
        if (userInput==0)
            return 1;
        return userInput * factorialRec(userInput-1);
    }

    //using ternary operator and recursive approach
    private static int factorialTer(int userInput){
        return (userInput==0 || userInput==1) ? 1 : userInput*factorialTer(userInput-1);
    }

}