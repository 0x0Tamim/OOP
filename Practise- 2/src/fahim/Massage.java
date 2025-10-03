package fahim;

public class Massage {
    public static void massage() {
        // Static method cannot access non-static members
        System.out.println("Hello Tamim");
    }
}
//📌 Static methods belong to the class, not the object.
//So they can be called using ClassName.methodName() (though you used it via object in Main,
// which still works but is less common for static).