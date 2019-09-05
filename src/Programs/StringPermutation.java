package Programs;

public class StringPermutation {
    public static void main(String[] args) {
        printPermut("abc","");
    }

    private static void printPermut(String str, String prefix) {
        if (str.length()==0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < str.length(); i++) {
                System.out.println("The value of i is" + i);
                String ros = str.substring(0,i) + str.substring(i+1);
                printPermut(ros,prefix + str.charAt(i));
            }
        }
    }
}
