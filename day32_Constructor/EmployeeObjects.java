package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Berk");
        System.out.println(employee1);

        Employee employee2 = new Employee("Ulya", 'F');
        System.out.println(employee2);

        Employee employee3 = new Employee("Sabrina", 'F', "SDET");
        System.out.println(employee3);


    }
}
