package packageA;

public class A {

    public int n;
    String name;


    public A(int n) {
        this.n = n;
        this.name = Integer.toString(n);
    }

    public A() {
    }

    public static void main(String[] args) {
        A a =new A();
        int n = a.n;

    }
}

/*
private - only on that file
public - any where(that class,that package,sub class-same package, sub class - diff package, diff package and not subclass)
default - that class,that package,sub class-same package
protected  - any where(that class,that package,sub class-same package, sub class - diff package)*/
