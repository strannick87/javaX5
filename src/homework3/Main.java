package homework3;

import homework3.Animal.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*        Phone.receiveCall("Игорь");
        Phone.getNumber("Стёпа","Samsung");
        Phone.receiveCall("Серёжа","Honor","777");
        Phone.receiveCall("пельмешек","000");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номера через пробел, которым будут отправлены сообщения");
        String input = console.nextLine();
        Phone.sendMessage(input);

        Cat сat = new Cat();
        System.out.println(сat.makeNoise());
        сat.eat();
        сat.sleep();

        Dog dog = new Dog();
        System.out.println(dog.makeNoise());
        dog.eat();
        dog.sleep();

        Horse horse = new Horse();
        System.out.println(horse.makeNoise());
        horse.eat();
        horse.sleep();*/

        Student student = new Aspirant() {
            @Override
            public String getScholarship() {
                return this.sum;
            }
        };
        System.out.println(student.getScholarship());
        ;
        //String students[] = student.getScholarship();
    }

}
