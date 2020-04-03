package ua.hulimova.patterns.bridge;

public class ContemporaryDancer implements Dancer{
    @Override
    public void dance() {
        System.out.println("dance contemporary");
    }

    @Override
    public void learn() {
        System.out.println("learn contemporary");
    }

    @Override
    public void practise() {
        System.out.println("practise contemporary");
    }
}
