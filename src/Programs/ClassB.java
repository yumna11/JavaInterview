package Programs;

public class ClassB extends ClassA {

    @Override
    public void print() {
        System.out.println("I am class B");
    }

    public static void main(String[] args) {
        ClassA classObj = new ClassB();
        classObj.print();
        classObj.doTask2();
        //doTask2 is a final method, we can't override it rather we can use it
        //another method doTask is private, therefore we can't call it here
        //class b will be printed

        ClassA classObj1 = new ClassA();
        classObj1.print();
        //class a will be printed

        ClassA classObj2 = (ClassA) new ClassB();
        classObj2.print();
        //class b will be printed

        ClassB classObj3 = (ClassB) new ClassA();
        classObj3.print();
        //class b will be printed
    }
}
