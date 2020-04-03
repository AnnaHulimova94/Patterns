package ua.hulimova.patterns.abstractfactory;

class BlueFactory implements ColorFactory {
    @Override
    public Shape getSquare() {
        return new BlueSquare();
    }

    @Override
    public Shape getTriangle() {
        return new BlueTriangle();
    }
}
