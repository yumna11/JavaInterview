public class MyObject {

    public synchronized void foo(String name){
        try {
            System.out.println("Thread " + name + ".foo(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".foo(): ending");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread " + name + ".foo(): interrupted");
        }
    }

    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyClass thread1 = new MyClass(obj1,"1");
        MyClass thread2 = new MyClass(obj2,"2");
        thread1.start();
        thread2.start();
    }
}
