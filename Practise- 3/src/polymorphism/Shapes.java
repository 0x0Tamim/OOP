package polymorphism;

public class Shapes {


    static void color(){
        System.out.println("Shape has no specific color"); // will always run thought object is not created, can inherit but not override

    }

     final void area(){   //final method cannot be overriden. final keyword is also use to prevent inheritance, if parent is final it can make child
        System.out.println("Shape is running");
    }
}
//override - runtime