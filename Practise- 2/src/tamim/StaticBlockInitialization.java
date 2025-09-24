package tamim;

public class StaticBlockInitialization {
    static int a = 5;  // Static variable
    static int b;      // Will be initialized in static block

    // Static block runs only once: when the class is first loaded (even before any object is created)
    static {
        System.out.println("I am static block");
        b = a * 10;  // Initializing static variable b based on a
    }
}
