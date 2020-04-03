package ua.hulimova.patterns.abstractfactory.furniture;

class VictorianFactory implements StyleFactory {
    @Override
    public Furniture getChair() {
        return new VictorianChair();
    }

    @Override
    public Furniture getTable() {
        return new VictorianTable();
    }
}
