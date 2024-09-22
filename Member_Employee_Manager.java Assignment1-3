/*Create a class named Member having the following members:
Data members:
1. Name
2. Age
3. Phone number
4. Address
5. Salary
It also has a method named &#39;printSalary&#39; which prints the salary of the members.
Two classes Employee and Manager inherits the Member class. The Employee and Manager
classes have data members specialization and department respectively. Now, assign name, age,
phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
        System.out.println();
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
    public void displayManagerInfo() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "1234567890", "123 Main St", 50000, "Software Development");
        employee.displayEmployeeInfo();
        Manager manager = new Manager("Jane Smith", 45, "0987654321", "456 Oak St", 80000, "IT Department");
        manager.displayManagerInfo();
    }
}
