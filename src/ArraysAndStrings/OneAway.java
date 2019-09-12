package ArraysAndStrings;

public class OneAway {

    public static void main(String[] args) {
        String str1 = "pale", str2 = "bake";
        System.out.println("The given strings are "+str1+" and "+str2);
        System.out.println(isEdit(str1,str2));
    }

    private static boolean isEdit(String str1, String str2) {
        if (str1.length() > str2.length())
            return true;

        if (str1.length()==str2.length()){
            boolean foundDifference = false;
            for (int i = 0; i <str1.length() ; i++) {
                if (str1.charAt(i) != str2.charAt(i)){
                    if (foundDifference)
                        return false;
                }
                foundDifference = true;
            }
        }


        return true;
    }
}
