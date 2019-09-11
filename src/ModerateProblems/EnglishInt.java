package ModerateProblems;

public class EnglishInt {
    public static void main(String[] args) {
        printInt();
    }

    private static void printInt() {
        int number = 1234, count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (number>0){
            int value = (int) ((number%10) * Math.pow(10,count));
            number /= 10;
            count++;
            System.out.println(value);
        }

    }
}
