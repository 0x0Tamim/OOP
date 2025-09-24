package tamim;

public class Human {
    String name;         // Instance variable (belongs to each object)
    int age;
    String religon;

    static int population;  // Static variable (shared across all objects of Human)

    // Static method — can only access static variables
    public static void message() {
        System.out.println("Hello people!");
    }

    // Constructor
    public Human(String name, int age, String religon) {
        this.name = name;
        this.age = age;
        this.religon = religon;
        Human.population += 1; // Increments static population count every time a new Human is created
    }
}
