/*Create an abstract Employee class with the following attributes:
● name (String)
● salary (double)
Implement abstract methods:
● calculateSalary()
Create concrete subclasses RegularEmployee and ContractEmployee that inherit from Employee
and implement the calculateSalary() method according to their specific salary calculation
rules.*/
abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name) {
        this.name = name;
    }
    public abstract void calculateSalary();
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
}
class RegularEmployee extends Employee{
    private double baseSalary;
    private double bonus;

    public RegularEmployee(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        calculateSalary();
    }
    @Override
    public void calculateSalary() {
        salary = baseSalary + bonus;
    }
}
class ContractEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        calculateSalary();
    }
    @Override
    public void calculateSalary() {
        salary = hourlyRate * hoursWorked;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee regular = new RegularEmployee("John", 3000, 500);
        Employee contract = new ContractEmployee("Jane", 50, 160);

        System.out.println(regular.getName() + "'s Salary: " + regular.getSalary());
        System.out.println(contract.getName() + "'s Salary: " + contract.getSalary());
    }
}
