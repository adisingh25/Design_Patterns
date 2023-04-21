package Decorator_Pattern_Demo;

public class RedDecorator extends ShapeDecorator{

    RedDecorator(Shape myShape) {
        super(myShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedborder();
    }

    private void setRedborder() {
        System.out.println("Adding a red border around it");
    }
}
