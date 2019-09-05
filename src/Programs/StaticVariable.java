package Programs;

public class StaticVariable {
    int i = 5;
    static int j = 5;

    //this program tests the static variable
    public static void main(String[] args) {
       StaticVariable staticVariable = new StaticVariable();
       staticVariable.test();
        StaticVariable staticVariable1 = new StaticVariable();
        staticVariable1.test();
        //the output would be 10, and 10
        System.out.println("when variable is static");
        StaticVariable staticVariable2 = new StaticVariable();
        staticVariable2.test1();
        StaticVariable staticVariable3 = new StaticVariable();
        staticVariable3.test1();
        //the output would be 10, and 15. becuase the same copy of variable is shared among different instances of a class

    }

    private void test1() {
        j=j+5;
        System.out.println(j);
    }

    private void test() {
        i=i+5;
        System.out.println(i);
    }
}
