package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
initials("Lollipop","Donut");
domainOfEmail("kayalabva@gmail.com");
nameOfMonth(3);
nameOfDay(2);
daysInMonth("March");

        System.out.println("------------------------------------------------");

String[] emails = {"lollipop@email.com","bahamamama@yahoo.com","kahyalabva@vkontakte.com","cosmopolitan@mail.com"};
        for (String email : emails) {
            domainOfEmail(email);
        }


    }
    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String secondName){

        char ch1= firstName.charAt(0);
        char ch2 = secondName.charAt(0);

        System.out.println("Name Initials: " + ch1 + "." +ch2 + ".");
    }
    //2. Create a method that can display the domain of the email
    public static void domainOfEmail(String email){
        //cydeoSchool@gmail.com
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("Domain: " + domain);

    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth (int numOfMonth) {
        switch (numOfMonth) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Fev");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid Number");


        }
    }
    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay (int numOfDay){
        switch (numOfDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");

        }
}
    // 5. Create a method that can print how many days a month has
    public static void daysInMonth(String monthName){
        switch (monthName){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("There are 31 days in " + monthName);
                break;
            case "February":
                System.out.println("There are 28/29 days in " + monthName);
                break;
            case "Aprel":
            case "June":
            case "September":
            case "November":
                System.out.println("There are 30 days in " + monthName);
        }
    }



}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */
