package Programs;

public class StringManipulation {
    //this program Remove Junk/Special Chars in a String
    public static void main(String[] args) {
        System.out.println("");
        removeJunk();
    }

    private static void removeJunk() {

        // '\\W' removes all special characters from string
        String sentence = "Yumna asim is $a go#od girl";
        System.out.println(sentence);
        System.out.println("After removing the special characters");
        sentence =  sentence.replaceAll("\\W","");
        System.out.println(sentence);
    }

    private static void checkChar() {
        //how to check if char is a special character, check ch against range of a to z, A to Z, 0 to 9
        char ch = '$';
        if (!(ch >= 'a' && ch <= 'z'
                || ch >= 'A' && ch <= 'Z'
                || ch >= 0 && ch <= 9)){
            System.out.println(ch+" is a special character");
        }
    }

    private static void manipulateString() {
        String name = "yumna is a girl";
        System.out.println("The result of comparing yumna with yumna is " + name.compareTo("yumna"));
        System.out.println("The result of comparing yumna with Yumna is " + name.equalsIgnoreCase("Yumna"));
        System.out.println("The result of matching yumna is a girl with yumna(.*) is " + name.matches("yumna(.*)"));
    }
}
