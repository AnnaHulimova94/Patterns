package ua.hulimova.patterns.abstractfactory;

class RedFactory implements ColorFactory {

    @Override
    public Shape getSquare() {
        return new RedSquare();
    }

    @Override
    public Shape getTriangle() {
        return new RedTriangle();
    }
}
