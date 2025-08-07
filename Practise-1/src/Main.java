import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Student[] students = new Student[5];
        //System.out.println(Arrays.toString(students));

        Student tamim = new Student("Tamim",298,64);
        Student abir = new Student();
        Student random = new Student(tamim);
        //tamim.name = "Tamim Uz Zaman";
        //tamim.rollNo = 298;

        System.out.println(tamim);
        System.out.println(tamim.name);
        System.out.println(tamim.rollNo);
        System.out.println(tamim.marks);

        System.out.println(abir.name);
        System.out.println(abir.rollNo);
        System.out.println(abir.marks);

        System.out.println(random.name);
    }
}
    class Student{
        String name;
        int rollNo;
        float marks ;

        Student(Student other){
            this.name = other.name;
            this.rollNo = other.rollNo;
            this.marks = other.marks;
        }
        Student(){
            this.name = "Abir";
            this.rollNo = 86;
            this.marks = 79;
        }
        Student(String name,int rollNo,float marks){
          this.name = name;
          this.rollNo = rollNo;
          this.marks = marks;
        }

    }
