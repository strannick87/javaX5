package lesson4;

public static void main(String[] args) {
//Верно, если Employee реализует интерфейс Movable
        Movable m = new Employee("Artem", 31);
        if (m instanceof Movable){
        System.out.println("m instanceof Movable");
        }
        Employee employee = new Employee("Ivan", 33);
        System.out.println(employee.toString());
        System.out.println(employee);

        StringBuilder builder = new StringBuilder () ;
        builder.append("Hello");
        builder.append("X5");
        String str = builder.toString();

        }


public abstract class Person {
    private String name;
    public String getName() {
        return name;
    }
    public abstract String getDescription();
}

class Employee extends Person  implements Movable {
    private String name;
    private int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee[name=" + name + ", age=" + age+"]";
    }


    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getDescription() {
        return "сотрудник с зарплатой 50 тыс. долларов США";
    }

    @Override
    public void forward() {
        System.out.println("Go forward");
    }

    @Override
    public void back() {
        System.out.println("Go back");
    }

    @Override
    public void start() {
        System.out.println("Go start");
    }
}

class Student extends Person{
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getDescription() {
        return "студент, изучающий вычислительную технику";
    }
}

