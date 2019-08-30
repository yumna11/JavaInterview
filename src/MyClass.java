public class MyClass extends Thread {

    String name;
    MyObject myObject;

    public MyClass(MyObject myObject, String name){
        this.name = name;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.foo(name);
    }
}

