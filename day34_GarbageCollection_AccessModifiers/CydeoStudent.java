package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName = "Cydeo School";

    public CydeoStudent(String studentName){
        this.studentName = studentName;
    }

}
class CydeoStudentObjects{
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Lolly");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
