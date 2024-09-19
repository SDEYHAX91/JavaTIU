/*Create a class Student with public data member name and private data members id and marks.
Write public set and get methods for the private data members. Use a constructor to set id to
211001000000 and marks to 0. Take the last 4 digits of the id from user and construct the full id.
Take the name and marks as input. Display name, full id and marks of 2 students.*/

import java.util.Scanner;

public class Student {
    public String name;
    private String id;
    private int marks;

    public Student(String last4Digits, String name, int marks) {
        this.id = "211001" + last4Digits;
        this.marks = marks;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last 4 digits of ID for student 1: ");
        String last4Digits1 = scanner.nextLine();
        System.out.print("Enter name for student 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter marks for student 1: ");
        int marks1 = scanner.nextInt();
        scanner.nextLine();

        Student student1 = new Student(last4Digits1, name1, marks1);
        System.out.print("Enter last 4 digits of ID for student 2: ");
        String last4Digits2 = scanner.nextLine();
        System.out.print("Enter name for student 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter marks for student 2: ");
        int marks2 = scanner.nextInt();
        
        Student student2 = new Student(last4Digits2, name2, marks2);
        System.out.println("\nStudent 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Full ID: " + student1.getId());
        System.out.println("Marks: " + student1.getMarks());
        
        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Full ID: " + student2.getId());
        System.out.println("Marks: " + student2.getMarks());
        scanner.close();
    }
}
