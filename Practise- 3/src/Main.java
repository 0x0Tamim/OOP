public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("h = "+box.h+" l = "+box.l+" w = "+box.w);
        Box box1 = new Box(5);
        System.out.println("h = "+box1.h+" l = "+box1.l+" w = "+box1.w);
    }

}
