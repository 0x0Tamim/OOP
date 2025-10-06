package Encapsulation;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Amit");               // setting value using setter
        System.out.println(s.getName()); // getting value using getter
    }
}


 /*   Encapsulation is the process of wrapping data (variables) and code (methods) together as a single unit.

        In Java, it means:
        ✅ Making variables private
✅ Providing public getters/setters to access and update them

        🎯 Why use Encapsulation?

        ✅ Protect data from direct access (data hiding)

        ✅ Control how data is set or retrieved

        ✅ Make the code more secure and flexible*/

