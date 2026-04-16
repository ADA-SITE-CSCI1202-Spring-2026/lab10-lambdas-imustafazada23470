import java.util.ArrayList;
import java.util.function.*;

class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Double getSalary(){
        return this.salary;
    }

}

public class Mapping {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nahid", "Alakbarli", 2000));
        employees.add(new Employee("Leyla", "Abbasova", 5000));

    Function<Employee, String> formatCard  = (e) -> ("Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary());
    Function<Employee, Double> salaryPicker = Employee:: getSalary;

    for (Employee employee : employees){
        System.out.println(formatCard.apply(employee));
        System.out.println("Salary: $" + salaryPicker.apply(employee));
     }

    }
}
