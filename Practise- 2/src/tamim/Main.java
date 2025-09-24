package tamim; // Package is like a folder or namespace that groups related classes together

import fahim.Massage; // Importing class from another package

public class Main {
    public static void main(String[] args) {
        // --- Static Methods & Packages ---
        Massage msg = new Massage();  // Creating object from a different package (fahim)
        msg.massage();                // Calling a static method (note: could be called directly as Massage.massage())

        // --- Static Variables (shared across all objects) ---
        // Creating multiple Human objects
        Human tamim = new Human("Tamim", 22, "Islam");
        Human fahim = new Human("Fahim", 21, "Islam");
        Human ramim = new Human("Ramim", 25, "Islam");
        Human abir = new Human("Abir", 25, "Islam");

        System.out.println(tamim.name);          // Accessing instance variable
        System.out.println(Human.population);    // Accessing static variable — shared among all Human objects

        Human.message(); // Calling a static method — common for all Humans

        // --- Static Block Initialization ---
        StaticBlockInitialization obj = new StaticBlockInitialization();
        System.out.println(StaticBlockInitialization.a + "  " + StaticBlockInitialization.b);

        // Changing static variable 'b'
        StaticBlockInitialization.b += 3;
        System.out.println(StaticBlockInitialization.a + "  " + StaticBlockInitialization.b);

        // Creating another object, static block does NOT run again
        StaticBlockInitialization obj2 = new StaticBlockInitialization();
        System.out.println(StaticBlockInitialization.a + "  " + StaticBlockInitialization.b);

        // --- Singleton Class Usage ---
        Singleton newobj = Singleton.getInstance();  // All these refer to the same Singleton instance
        Singleton newobj2 = Singleton.getInstance();
        Singleton newobj3 = Singleton.getInstance();

        // All 3 variables point to the same object due to Singleton pattern
    }
}
/* | Concept                     | Description                                                        |
| --------------------------- | ------------------------------------------------------------------ |
| **Package**                 | Groups related classes; helps organize code                        |
| **Static Variable**         | Shared across all instances of a class                             |
| **Static Method**           | Belongs to class, not object; can only access static stuff         |
| **Static Block**            | Executes once when class is loaded; good for static variable setup |
| **Singleton Pattern**       | Ensures only one instance of a class is created                    |
| **Inner Static Class**      | Can exist without creating an outer class object                   |
| **In-built Static Methods** | Examples include `Math.pow()`, `Arrays.toString()`                 |
*/