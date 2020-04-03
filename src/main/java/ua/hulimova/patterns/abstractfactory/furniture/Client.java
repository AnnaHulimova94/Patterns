package ua.hulimova.patterns.abstractfactory.furniture;

class Client {

    public static void main(String[] args) {
        String name = FurnitureFactory.createStyleFactory("classic").getTable().getName();
        System.out.println(name);

        name = FurnitureFactory.createStyleFactory("victorian").getTable().getName();
        System.out.println(name);

    }
}
