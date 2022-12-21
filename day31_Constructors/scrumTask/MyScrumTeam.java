package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Kayya", 11234, "SDET", 145000);
        Tester tester2 = new Tester("Lola", 11256, "SDET", 143000);
        Tester tester3 = new Tester("Ali",11243,"SDET",142000);
        Tester tester4 = new Tester("Alex",11244,"SE",135000);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Vince", 22765, "Developer", 182000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 22, "Software Developer", 135000);
        Developer developer4 = new Developer("Sinem", 13, "Senior Developer",200000);

        Developer[] developers = {developer1, developer2, developer2, developer3};

        ScrumTeam scrum = new ScrumTeam("Federico","Zac", "Alam", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("--------------------------------------------");

        for(Tester eachTester : testers){
            System.out.println(eachTester.name + " - " + eachTester.salary);
        }
        System.out.println("------------------------------------------------------");

        for (Developer eachDeveloper : scrum.developerList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("------------------------------------------------------");

        scrum.removeTester( 11256 );
        scrum.removeDeveloper( 22 );

        System.out.println(scrum);



    }

}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */
