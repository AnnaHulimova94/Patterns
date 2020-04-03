package ua.hulimova.patterns.singleton;

class FirstSingleton {
    private static FirstSingleton instance;
    String value;

    private FirstSingleton(String value) {
        this.value = value;
    }

    static synchronized FirstSingleton getInstance(String value) {
        if (instance == null) {
            instance = new FirstSingleton(value);
        }

        return instance;
    }
}
