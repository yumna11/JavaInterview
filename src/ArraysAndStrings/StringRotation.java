package ArraysAndStrings;

public class StringRotation {
    public static void main(String[] args) {
        isRotate();
    }

    private static void isRotate() {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        int index = 0;
        if (str1.length() != str2.length())
            System.out.println("Given strings are not a rotation of each other.");
        for (int i = 0; i < str1.length() ; i++) {
            if (str2.charAt(0)==str1.charAt(index)){
                str1 = str1.substring(index).concat(str1.substring(0,index));
                if (str1.equals(str2))
                     System.out.println("Given strings are a rotation of each other.");
                else
                    System.out.println("Given strings are not a rotation of each other.");
                break;
            }
            index++;
        }
    }
}
