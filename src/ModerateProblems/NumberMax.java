package ModerateProblems;

public class NumberMax {
    public static void main(String[] args) {
        findMax();

    }

    private static int flip(int bit) {
        return 1^bit;
        //^ is the XOR operator, it inverse the given bit, 0 to 1, and 1 to 0
    }

    private static void findMax() {
        int a = 10;
        int b = 50;
        int k = sign(a-b);
        int q =  flip(k);
        System.out.println("The numbers are "+a+" and "+b);
        System.out.println("The maximum number is "+((a*k)+(b*q)));

    }

    //returns 1 if difference is positive, return 0 if it's negative
    private static int sign(int difference) {
        // & is the bitwise AND operator, >> is the shift operator
        //if difference is positive, then difference>>31 return 0, 0&1 = 0, flip(0) = 1
        //if difference is negative, then difference>>31 return -1, -1&1 = 1, flip(1) = 0
        return flip((difference>>31) & 0x1);

    }
}
