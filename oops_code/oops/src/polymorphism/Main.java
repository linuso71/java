package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Circle(); //  this will override the method of the parent class
        Shapes square = new Square();
        Circle circle = new Circle();
        circle.area(); // this always call the method of the reference class which is circle.
//        shape.area();
//        square.area();
    }
}
