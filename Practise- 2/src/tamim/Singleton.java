package tamim;

public class Singleton {
    // Step 1: Make constructor private so no one else can create object directly
    private Singleton() {}

    // Step 2: Create a static variable to hold the single instance
    private static Singleton instance;

    // Step 3: Provide a public method to access the instance
    public static Singleton getInstance() {
        // Lazy initialization: object is created only when needed
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
//🧠 Singleton ensures only one object exists across your whole program —
// useful for things like logging, config management, database connections, etc.