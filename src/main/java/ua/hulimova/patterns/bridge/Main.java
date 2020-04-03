package ua.hulimova.patterns.bridge;

public class Main {
    public static void main(String[] args) {
        Dancer first = new ContemporaryDancer();
        Dancer second = new BallroomDancer();

        BeginnerDancer beginner = new BeginnerDancer(first);
        beginner.learn();
        beginner.practise();
        beginner.dance();

        beginner = new BeginnerDancer(second);
        beginner.learn();
        beginner.practise();
        beginner.dance();
    }
}
