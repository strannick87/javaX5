package homework3;

public class Animal {
    public static String food;
    public String location;

    public static class Animals implements Eat,Sleep{
         public String makeNoise() {
             return this.getClass().getSimpleName() + " говорит ";
         }

    }

    public static class Cat extends Animals {
        public String makeNoise() {
            return super.makeNoise() + "Мяу";
        }
        String food = "рыбку";
        String location = "дома";
        public void eat() {
            eat(food);
        }
        public void sleep() {
            eat(location);
        }
    }

    public static class Dog extends Animals {
        public String makeNoise() {
            return super.makeNoise() + "Гав";
        }
        String food = "косточку";
        String location = "в будке";
        public void eat() {
            eat(food);
        }
        public void sleep() {
            eat(location);
        }
    }

    public static class Horse extends Animals {
        String say = "Тыгыдык";
        public String makeNoise() {
            return this.getClass().getSimpleName() + " делает "+say;
        }
        String food = "солому";
        String location = "в стойле";
        public void eat() {
            eat(food);
        }
        public void sleep() {
            eat(location);
        }
    }


    public interface Eat {
        default void eat(String food) {
            System.out.println(this.getClass().getSimpleName() + " ест " + food);
        }
    }
    public interface Sleep {
        default void sleep(String location) {
            System.out.println(this.getClass().getSimpleName() + " спит " + location);
        }
    }
}
