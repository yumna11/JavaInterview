package Programs;

public class SwapStrings {


    public static void main(String[] args) {
        swap();
    }

    private static void swap() {
        //concate str1 with str2 and store the value in str1
        //assign value of str1 to str2, by calling substring(0, str2.length()) method i.e. substring(beginIndex, endIndex)
        //assign str1 = substring(str2.length()) i.e. substring(beginIndex)
        String str1 = "yumna";
        String str2 = "humza";
        System.out.println("Str1 is "+str1+" and Str2 is "+str2);
        System.out.println("After swapping");
        str1 = str1.concat(str2);

        System.out.println("Str1 is "+str1.substring(str2.length())+
                " and Str2 is "+(str1.substring(0,str2.length())) );
    }
}
