// Base class Person
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student
class Student extends Person {
    String studentID;
    String course;
    int units;
    double totalFee;

    // Constructor
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
        calculateFee();
    }

    // Method to calculate total fee based on units
    public void calculateFee() {
        totalFee = units * 1000;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + totalFee);
    }
}

// Subclass Instructor
class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    // Constructor
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Main class for testing
public class UniversitySystem {
    // Polymorphic method to print details
    public static void printInfo(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        // Create Student objects example
        Student student1 = new Student("Nick Jonel Carinaga", 20, "231000320", "Data Structure and Algorithm Analysis", 2);
        Student student2 = new Student("Ann Margareth Gabrillo", 19, "231000186", "Computer-aided Drafting and Design", 1);

        // Create Instructor objects example
        Instructor instructor1 = new Instructor("Tanya Carmela Jovillano", 22, "321000240", "College of Engineering and Architecture", 80000);
        Instructor instructor2 = new Instructor("Angela Caning", 23, "321000240", "College of Engineering and Architecture", 80000);

        // Print information for each person
        System.out.println("Student Information:");
        printInfo(student1);
        System.out.println("\nStudent Information:");
        printInfo(student2);
        System.out.println("\nStudent Information:");

        System.out.println("\nInstructor Information:");
        printInfo(instructor1);
        System.out.println("\nInstructor Information:");
        printInfo(instructor2);
    }
}
