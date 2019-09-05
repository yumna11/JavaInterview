package Programs;

public class Pattern {
    public static void main(String[] args) {
        printPyramid();
        numberPattern();
    }

    private static void numberPattern() {
        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print((j+1));
            }
            System.out.println(" ");

        }
    }

    private static void printPyramid() {
        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = rows-i; j > 1; j--) {
                System.out.print(" ");
            }


            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}
