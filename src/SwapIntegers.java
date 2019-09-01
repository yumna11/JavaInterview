public class SwapIntegers {
    public static void main(String[] args) {
        swap3();
    }

    private static void swap3() {
        //this method uses bitwise operation
        int x=5;
        int y=10;
        System.out.println("Num1 is "+x+" and Num2 is "+y);
        System.out.println("After swapping");
        x = x^y;
        y=x^y;
        x=x^y;
        System.out.println("Num1 is "+x+" and Num2 is "+y);


    }

    private static void swap2() {
        //this method swap 2 numbers only
        int num1 = 10;
        int num2 = 50;
        System.out.println("Num1 is "+num1+" and Num2 is "+num2);
        System.out.println("After swapping");

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Num1 is "+num1+" and Num2 is "+num2);
    }

    private static void swap1() {
        int[] array = {1,2,3,4,5};
        int num1 = 3;
        int num2 = 4;
        for (int i=0;i<array.length;i++) {
            if (array[i]==num1){
                num1 = num1+num2;
                array[i] = num1-array[i];
            }
            else  if (array[i]==num2)
                array[i] = num1-num2;
        }
        for (int i:array) {
            System.out.println(""+i);
        }
    }

    private static void swap() {
        int[] array = {1,2,3,4,5};
        int num1 = 3;
        int num2 = 4;
        int indexNum1 = 0, temp =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num1)
            {
                indexNum1 = i;
                temp = array[i];
            }else if (array[i]==num2){
                array[indexNum1] = array[i];
                array[i] = temp;
            }
        }
        for (int i:array) {
            System.out.println(""+i);
        }
    }
}
