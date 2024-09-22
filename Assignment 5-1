/*Define a superclass named ‘College’ having the following data members: college name, address,
a list of departments and a list of Faculty and it also has a Member function named
displayCollegeDetails() to display the details of college. It also has a constant “MY_COLLEGE”.
Define a class named ‘Department’ that inherits ‘College’ class. It has the following data
members named total number of department, department name, HOD name and a member
function named display() to display the details of the Department.
Define a class named ‘Faculty’ that inherits ‘Department’ class. It has the following data
members named total number of faculty, faculty name, no of years worked and a member
function named display() to display the details of the Faculty.
Create classes with suitable constructor and use them.*/

import java.util.ArrayList;
import java.util.List;

class College {
    protected String collegeName;
    protected String address;
    protected List<String> departments;
    protected List<String> faculties;

    public static final String MY_COLLEGE = "My College Constant";

    public College(String collegeName, String address, List<String> departments, List<String> faculties) {
        this.collegeName = collegeName;
        this.address = address;
        this.departments = departments;
        this.faculties = faculties;
    }
    public void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + address);
        System.out.println("Departments: " + String.join(", ", departments));
        System.out.println("Faculties: " + String.join(", ", faculties));
        System.out.println("Constant: " + MY_COLLEGE);
    }
}
class Department extends College {
    protected int totalDepartments;
    protected String departmentName;
    protected String hodName;
  
    public Department(String collegeName, String address, List<String> departments, List<String> faculties,
                      int totalDepartments, String departmentName, String hodName) {
        super(collegeName, address, departments, faculties); // Calling the superclass constructor
        this.totalDepartments = totalDepartments;
        this.departmentName = departmentName;
        this.hodName = hodName;
    }
    public void display() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("HOD Name: " + hodName);
        System.out.println("Total Departments: " + totalDepartments);
    }
}
class Faculty extends Department {
    protected int totalFaculty;
    protected String facultyName;
    protected int yearsWorked;

    public Faculty(String collegeName, String address, List<String> departments, List<String> faculties,
                   int totalDepartments, String departmentName, String hodName, 
                   int totalFaculty, String facultyName, int yearsWorked) {
        super(collegeName, address, departments, faculties, totalDepartments, departmentName, hodName); // Calling the superclass constructor
        this.totalFaculty = totalFaculty;
        this.facultyName = facultyName;
        this.yearsWorked = yearsWorked;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Years Worked: " + yearsWorked);
        System.out.println("Total Faculty: " + totalFaculty);
    }
}
public class Main {
    public static void main(String[] args) {
        List<String> departments = new ArrayList<>();
        departments.add("Computer Science");
        departments.add("Mechanical Engineering");
        departments.add("Electrical Engineering");
        List<String> faculties = new ArrayList<>();
        faculties.add("John Doe");
        faculties.add("Jane Smith");
        Faculty faculty = new Faculty("XYZ College", "123 College St", departments, faculties,
                                      3, "Computer Science", "Dr. Alan Turing",
                                      10, "John Doe", 15);
        faculty.displayCollegeDetails();
        faculty.display();
    }
}
