package ArraysAndStrings;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println( compressString());
    }

    private static String compressString() {
        String str = "abccccbbmmmm";
        int compressedLength = countCompressed(str);
        if (compressedLength > str.length()) return str;
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
               result.append(str.charAt(i)).append(count) ;
               count = 0;
            }
        }
        return result.toString();
    }

    private static int countCompressed(String str) {
        int compressedLength = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
               compressedLength += 1 + String.valueOf(count).length();
               count = 0;
            }
        }
        return compressedLength;
    }
}
