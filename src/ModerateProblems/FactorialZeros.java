package ModerateProblems;

public class FactorialZeros {
    public static void main(String[] args) {
        count();
        int num = 13;
        System.out.println("The number of trailing zeros are "+countFactorsOfFive(num)+" in factorial of "+num);
    }

    private static int countFactorsOfFive(int num) {
        //count the factors of 5, range is 5 to num, the count is the number of trailing zeros
        int count = 0;
        for (int i = 5; i <= num; i++) {
            if (i%5 == 0)
                count++;
        }
        return count;
    }

    private static void count() {
        int count = 0;
        int value = 3456000;
        while (value > 9) {
            if (value % 10 == 0)
            {
                count++;
                value = value / 10;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
