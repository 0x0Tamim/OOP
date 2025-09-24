package tamim;

public class Human {
    String name;
    int age;
    String religon;

    static int population;

    public static void message(){
        System.out.println("Hello people!");
    }

    public Human(String name, int age, String religon) {
        this.name = name;
        this.age = age;
        this.religon = religon;
        Human.population+=1;

    }
}
