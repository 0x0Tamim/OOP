package tamim;

public class InnerClasses {
    // Static nested class (can exist without outer class instance)
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a); // Calls toString() → prints name
    }
}
//📌 Only nested classes (classes inside other classes) can be static.
  //      Outer-level classes cannot be static.