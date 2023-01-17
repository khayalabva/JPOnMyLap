package day40_FinalKeyword;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    Dog dog = new Dog("Molly", "Akita-Inu", 'f', "Red", "medium",2);

    public void eat(){
        System.out.println(getName()+"is eating dog food");
    }





}
