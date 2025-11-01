public class Son extends Parent {
    @Override                     //if child class extends abstract parent class then child class also has to be abstract or
                                  //must has to use the abstract methods of parent class
    void career(String name) {
        System.out.println("InshaAllah, I am going to be a "+name);
    }

    @Override
    void name(String name) {
        System.out.println("I am a boy and my name is "+name);
    }
}
