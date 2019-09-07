package Programs;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println( convertToInt("8731"));
    }

    private static int convertToInt(String str) {
        int intValue = 0;
        char[] array = str.toCharArray();
        int length = array.length;

        for (int i = 0; i < array.length; i++) {
            intValue = (int) (intValue + Character.getNumericValue(array[i]) * Math.pow(10,length-1));
            length--;
        }
        return intValue;
    }
}
