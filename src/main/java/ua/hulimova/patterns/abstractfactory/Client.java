package ua.hulimova.patterns.abstractfactory;

class Client {

    static void main(String[] args) {
        Shape shape = ShapeFactory.getColorFactory("red").getSquare();
        System.out.println(shape.getName());

        shape = ShapeFactory.getColorFactory("blue").getTriangle();
        System.out.println(shape.getName());
    }
}
