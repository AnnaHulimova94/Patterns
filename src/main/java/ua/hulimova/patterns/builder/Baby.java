package ua.hulimova.patterns.builder;

class Baby {
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    static Builder createBuilder(){
        return new Baby().new Builder();
    }

    public class Builder {

        public Builder setName(String name) {
            Baby.this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            Baby.this.age = age;
            return this;
        }

        public Builder setWeight(int weight) {
            Baby.this.weight = weight;
            return this;
        }

        public Baby build() {
            return Baby.this;
        }
    }
}
