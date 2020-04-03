package ua.hulimova.patterns.prototype;

import java.util.Objects;

abstract class Flower {
    private String name;

    Flower() {
    }

    public Flower(String name) {
        this.name = name;
    }

    Flower(Flower flower) {
        if (flower != null) {
            this.name = flower.name;
        }
    }

    public abstract Flower clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name);
    }
}
