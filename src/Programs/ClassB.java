package Programs;

public class ClassB extends ClassA {

    @Override
    public void print() {
        System.out.println("I am class B");
    }

    public static void main(String[] args) {
        ClassA classObj = new ClassB();
        classObj.print();
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
