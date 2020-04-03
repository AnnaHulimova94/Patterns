package ua.hulimova.patterns.bridge;

class BeginnerDancer implements Dancer {

    private Dancer dancer;

    BeginnerDancer(Dancer dancer) {
        this.dancer = dancer;
    }

    @Override
    public void dance() {
        dancer.dance();
    }

    @Override
    public void learn() {
        dancer.learn();
    }

    @Override
    public void practise() {
        dancer.practise();
    }
}
