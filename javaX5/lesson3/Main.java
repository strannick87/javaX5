package lesson3;

public class Main{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.name = "Artem";
        emp.salary = 20000.0;
        System.out.println(emp.name);
        System.out.println(emp.salary);
        emp.say("Hello");

        Manager manager = new Manager();
        manager.getSalary();

        Manager employee = (Manager) emp;
        employee.getBonus();

        Employee employee2 = new Employee( 1000,"Denis");
        if (employee2 instanceof Manager){
            Manager manager2 = (Manager) employee;
            manager2.getBonus();
        }

    }
}

/*class Employee {
    public Employee(){
        System.out.println("Parent");
    }
}
class Manager extends Employee{
    public Manager(){
        System.out.println("Child");
    }
}*/
