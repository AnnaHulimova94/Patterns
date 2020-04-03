package ua.hulimova.patterns.abstractfactory.furniture;

class FurnitureFactory {

    static StyleFactory createStyleFactory(String style) {
        if ("classic".equals(style)) {
            return new ClassicFactory();
        }

        if ("victorian".equals(style)) {
            return new VictorianFactory();
        }

        throw new IllegalArgumentException("Unknown style: " + style);
    }
}
