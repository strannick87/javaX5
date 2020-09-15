package lesson3;

import java.util.logging.Logger;

public class Employee{
    public double salary;
    public String name;
    //private final String name2;
    int grade;
    private static final String URL = "/Employee";
    public static final Logger LOGGER = Logger.getLogger(Employee.class.getName());

    // Конструктор
    Employee(){
        System.out.println("Constructor");
    }
    Employee(String name){
        this.name = name;
    }
    public Employee(double salary, String name){
        this.salary = salary;
        this.name = name;
    }
    Employee(String name, double salary, int grade){
        this.salary = salary;
        this.name = name;
        this.grade = grade;
    }

    // Метод
    void say(String word){
        System.out.println(word);
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    void setName(String name){
        this.name = name;
    }
    public void increase(double salary){
        this.salary += salary;
    }
    public void increase(double salary, double bonus){
        this.salary += salary * bonus;
    }

    /*public Employee(String name){
        this.name2 = name;
    }*/
    String getName(){
        return this.name;
    }

}

final class Manager extends Employee {
    private double bonus;

    public Manager() {
        double v = bonus + 100;
    }

    public double getBonus(){
        return bonus;
    }
    public Manager(String name, double salary, double bonus){
        super(salary, name);
        this.bonus = bonus;
    }
    @Override
    public double getSalary(){
        return super.getSalary() + bonus;
    }
}

