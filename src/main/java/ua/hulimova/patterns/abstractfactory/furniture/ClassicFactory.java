package ua.hulimova.patterns.abstractfactory.furniture;

class ClassicFactory implements StyleFactory {
    @Override
    public Furniture getChair() {
        return new ClassicChair();
    }

    @Override
    public Furniture getTable() {
        return new ClassicTable();
    }
}
