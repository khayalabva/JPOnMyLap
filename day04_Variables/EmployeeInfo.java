package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        /*
        6. Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yeaJrsOfExpereince (double)
				7. salary
 (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
         */

        String name = "Elkahn";
        int age = 32;
        char gender ='M';
        String company = "British American Tobacco";
        String jobTitle = "Lawer";
        double yearsOfExperience = 6.5;
        int salary = 45000;
        boolean isFullTime = true;
        boolean isMArried = false;
        String employeeId = "A0171";
        String SSN = "(123)-45-9729";

        System.out.println("name = " + name);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMArried = " + isMArried);
    }
}
