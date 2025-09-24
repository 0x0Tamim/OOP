package tamim;

import fahim.Massage;

public class Main {
    public static void main(String[] args) {
        Massage msg = new Massage();
        msg.massage();

        Human tamim = new Human("Tamim",22,"Islam");
        Human fahim = new Human("Famim",21,"Islam");
        Human ramim = new Human("Ramim",25,"Islam");
        Human abir = new Human("Abir",25,"Islam");

        System.out.println(tamim.name);
        System.out.println(Human.population);
        Human.message();

        StaticBlockInitialization obj = new StaticBlockInitialization();
        System.out.println(StaticBlockInitialization.a+"  "+StaticBlockInitialization.b);

        StaticBlockInitialization.b+=3;
        System.out.println(StaticBlockInitialization.a+"  "+StaticBlockInitialization.b);

        StaticBlockInitialization obj2 = new StaticBlockInitialization();
        System.out.println(StaticBlockInitialization.a+"  "+StaticBlockInitialization.b);

    }
}


