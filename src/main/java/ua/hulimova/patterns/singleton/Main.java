package ua.hulimova.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        FirstSingleton firstSingleton = FirstSingleton.getInstance("ha-ha");
        FirstSingleton secondSingleton = FirstSingleton.getInstance("haha");

        System.out.println(firstSingleton.value);
        System.out.println(secondSingleton.value);
        System.out.println(firstSingleton == secondSingleton);
    }
}
