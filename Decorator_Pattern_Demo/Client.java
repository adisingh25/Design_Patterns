package Decorator_Pattern_Demo;

public class Client {
    public static void main(String []args) {

        Shape r1 = new Rectangle();
        Shape redRectangle = new RedDecorator(r1);

        Shape s1 = new Square();
        Shape redSquare = new RedDecorator(new Square());

        r1.draw();
        redRectangle.draw();
        s1.draw();
        redSquare.draw();
    }
}
