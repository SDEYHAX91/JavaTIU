/*Design an Employee class with attributes like name, e_id and salary. Employee class has
setter and getter methods for all the attributes. Implement methods to calculate and set
Employee bonuses based on performance rating.*/
class Employee{
    String name, e_id;
    double salary ,bonus = 0.0;

    public void setInfo(String name, String e_id, double salary) {
        this.name = name;
        this.e_id = e_id;
        this.salary = salary;
    }    
    public String getName() {
        return name;
    }
    public String getEId() {
        return e_id;
    }
    public double getSalary() {
        return salary;
    }
    public double getBonus() {
        return bonus;
    }
    public void calculateBonus(char performanceRating) {
        double bonusPercentage = 0.0;
        switch (performanceRating) {
            case 'A':
                bonusPercentage = 0.20;
                break;
            case 'B':
                bonusPercentage = 0.10;
                break;
            case 'C':
                bonusPercentage = 0.05;
                break;
            default:
                bonusPercentage = 0.0;
                System.out.println("No bonus for performance rating below 'C'");
                break;
        }
        this.bonus = salary * bonusPercentage;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + e_id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Employee Bonus: $" + bonus);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setInfo("Sukesh", "E2410034", 50000.00);
        emp.displayEmployeeDetails();
        emp.calculateBonus('A');
        emp.displayEmployeeDetails();
    }
}
