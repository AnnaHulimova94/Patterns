package ua.hulimova.patterns.builder;

class Main {
    public static void main(String[] args) {
        Baby misha = Baby.createBuilder().setName("Misha").setAge(1).setWeight(13).build();
        System.out.println(misha.toString());
    }
}
