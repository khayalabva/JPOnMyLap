package day33_Statics;
import java.util.Arrays;
public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Ali");
        Student student2 = new Student("Lola", 'F');
        Student student3 = new Student("Aygun", 'F', 27);
        Student student4 = new Student("Federico", 'M', 20,11127);
        Student student5 = new Student("Vince", 'M', 30, 11130,'D');

        System.out.println(student1==student2);
        Student[] students = { student1, student2, student3, student4, student5};


        System.out.println(Arrays.toString(students) );

    }
}
