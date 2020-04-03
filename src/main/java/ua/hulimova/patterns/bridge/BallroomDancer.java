package ua.hulimova.patterns.bridge;

public class BallroomDancer implements Dancer{
    @Override
    public void dance() {
        System.out.println("dance tango");
    }

    @Override
    public void learn() {
        System.out.println("learn tango");
    }

    @Override
    public void practise() {
        System.out.println("practise tango");
    }
}
