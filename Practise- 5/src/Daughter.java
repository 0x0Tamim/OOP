public class Daughter extends Parent{


    @Override
    void career(String name) {
        System.out.println("I wanna be a "+name);
    }

    @Override
    void name(String name) {
        System.out.println("I am a girl and my name is "+name);
    }
}
