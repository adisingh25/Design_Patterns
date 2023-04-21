package Decorator_Pattern_Demo;

abstract class ShapeDecorator implements Shape {

    protected Shape s;

    ShapeDecorator(Shape myShape) {
        this.s = myShape;
    }

    public void draw() {
        this.s.draw();
    }
}
