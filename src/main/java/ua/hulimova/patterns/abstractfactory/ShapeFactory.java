package ua.hulimova.patterns.abstractfactory;

abstract class ShapeFactory {

    static ColorFactory getColorFactory(String color) {
        if ("blue".equalsIgnoreCase(color)) {
            return new BlueFactory();
        }

        if ("red".equalsIgnoreCase(color)) {
            return new RedFactory();
        }

        throw new IllegalArgumentException("Unknown color: " + color);
    }
}
