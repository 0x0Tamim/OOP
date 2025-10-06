package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes square = new Square();
        Circle circle = new Circle();
        Square square1 = new Square();

        shape.area();
        square.area();
        circle.area();
        square1.area();



    }
}
/*
"Polymorphism means: One name, many forms"
        In Java, it allows one method, object, or operator to behave differently based on the context.*/

//        1️⃣ Compile-Time Polymorphism (Method Overloading)
//
//        ➡️ Same method name, different parameters (in the same class).
//
//        2️⃣ Runtime Polymorphism (Method Overriding)
//
//        ➡️ Same method name, same parameters – but defined in parent and overridden in child.
