package ua.hulimova.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car());
        carList.add(new CarAdapter(new Dog()));

        for (Car car : carList) {
            car.beep();
        }
    }
}
