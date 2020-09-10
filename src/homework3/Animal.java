package homework3;

public class Animal {
    static String food;
    static String location;
    static String say = "smth";

    public static class Cat extends Animal {
        String say = "Мяу";
    }

    public class Dog extends Animal {
        String say = "Гав";
    }

    public class Horse extends Animal {
        String say = "Тыгыдык";
    }

    public static void makeNoise() {
        System.out.println("Животное говорит "+say);
    }
    public static void eat(String[] args) {

    }
    public static void sleep(String[] args) {

    }
}
