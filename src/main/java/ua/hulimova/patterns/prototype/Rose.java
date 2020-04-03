package ua.hulimova.patterns.prototype;

import java.util.Objects;

class Rose extends Flower {
    private String color;

    public Rose() {
    }

    public Rose(String name, String color) {
        super(name);
        this.color = color;
    }

    public Rose(Rose rose) {
        super(rose);
        if (rose != null) {
            this.color = rose.color;
        }
    }

    @Override
    public Flower clone() {
        return new Rose(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rose)) return false;
        if (!super.equals(o)) return false;
        Rose rose = (Rose) o;
        return Objects.equals(color, rose.color);
    }
}
