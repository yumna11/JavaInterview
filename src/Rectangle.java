public class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.breadth = rectangle.breadth;
        System.out.println("Copy coonstructor is called");
    }

    public static void main(String[] args) {
        new Rectangle(new Rectangle(5,5));
    }




}

