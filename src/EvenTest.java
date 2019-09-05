public class EvenTest {
    public static void main(String[] args) {
        isEven(101);
    }

    private static void isEven(int num) {
        //check if a number is an even or not, without using modulus operator
        //if num =9, 9/2 = 4.5, truncate .5, so 4*2=8, 8!=9, 9 is odd
        if ((num/2)*2==num){
            System.out.println("num = " + num + " is even");
        }
        else
            System.out.println("num = " + num + " is odd");
    }


}
