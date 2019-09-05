package Programs;

public class ReverseString {

    public static void main(String[] args) {
        reverseString("yumna");
        reverseString2("samina");
    }

    private static void reverseString2(String name) {
        //using string builder class and it's reverse method
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        System.out.println("Reverse of samina is " + stringBuilder.reverse());
    }

    private static void reverseString(String str) {
        //convert string to char array
        //traverse array from end to start and print each element
        char[] strArray = str.toCharArray();
        System.out.println("The reverse of yumna is ");
        for (int i=strArray.length-1;i>=0;i--) {
            System.out.print(strArray[i]);
        }
        System.out.println("");
    }
}
