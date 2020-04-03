package ua.hulimova.patterns.adapter;

class CarAdapter extends Car {
    private Dog dog;

    CarAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void beep() {
        dog.bark();
    }
}
