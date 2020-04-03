package ua.hulimova.patterns.prototype;

public class Main {

    public static void main(String[] args) {
        Flower f1 = new Rose("Rose", "Red");
        Flower f2 = f1.clone();

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.equals(f2));
        System.out.println(f1 == f2);
    }
}
