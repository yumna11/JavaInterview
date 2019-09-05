public class FibonacciSeries {
    //series is 0,1,1,2,3,5,8
    //recursive approach
    // Fn = Fn-1 + Fn-2
    static int fibonacci(int i){
        if(i==0)
            return 0;
        if (i==1)
            return 1;
        return fibonacci(i-1) + fibonacci(i-2);

    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        printSeries();

    }

    private static void printSeries() {
        int n = 8;
        int[] series = new int[n];
        //print first 8 numbers of Fibonacci series
        for (int i = 0; i < n; i++) {
            if (i==0 || i==1)
                series[i] = i;
            else
            {
               series[i] = series[i-1] + series[i-2];
            }
        }
        for (int val: series) {
            System.out.print(val+" ");
        }
    }
}
