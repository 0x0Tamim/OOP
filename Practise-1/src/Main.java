// Main class containing the entry point of the program
public class Main {
    public static void main(String[] args) {

        // Creating objects of the Student class using different constructors

        // Creating a Student object using the parameterized constructor
        Student tamim = new Student("Tamim", 298, 64);

        // Creating a Student object using the default constructor
        Student abir = new Student();

        // Creating a new Student object using the copy constructor
        Student random = new Student(tamim); // Copies data from 'tamim'

        // Printing the object itself (will show class name + hash unless toString is overridden)
        System.out.println(tamim); // Without overriding toString(), this prints something like: Student@1b6d3586

        // Accessing and printing individual fields of the 'tamim' object
        System.out.println(tamim.name);     // Output: Tamim
        System.out.println(tamim.rollNo);   // Output: 298
        System.out.println(tamim.marks);    // Output: 64.0

        // Accessing and printing individual fields of the 'abir' object (default values)
        System.out.println(abir.name);      // Output: Abir
        System.out.println(abir.rollNo);    // Output: 86
        System.out.println(abir.marks);     // Output: 79.0

        // Accessing and printing the name of the copied object
        System.out.println(random.name);    // Output: Tamim (copied from 'tamim')
    }
}

// Class representing a Student
class Student {
    // Fields (also called instance variables or attributes)
    String name;
    int rollNo;
    float marks;

    // Copy Constructor
    // Used to create a new Student object by copying the values from another Student object
    Student(Student other) {
        this.name = other.name;       // Copying name
        this.rollNo = other.rollNo;   // Copying roll number
        this.marks = other.marks;     // Copying marks
    }

    // Default Constructor (no parameters)
    // Initializes the object with some default values
    Student() {
        this.name = "Abir";
        this.rollNo = 86;
        this.marks = 79;
    }

    // Parameterized Constructor
    // Allows setting custom values when the object is created
    Student(String name, int rollNo, float marks) {
        this.name = name;         // 'this' refers to the current object's field
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // (Optional but recommended) Override the toString method for readable object print
    /*
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + ", marks=" + marks + "}";
    }
    */
}
