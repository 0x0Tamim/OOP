package tamim;

public class StaticBlockInitialization {
    static int a = 5;
    static int b;

    static{  //will only run once when the first obj is created
        System.out.println("I am static block");
        b = a*10;
    }

}
