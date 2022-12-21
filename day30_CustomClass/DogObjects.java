package day30_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Molly";
        dog1.breed = "Husky";
        dog1.color = "Grey";
        dog1.age = 1;
        dog1.gender = 'F';
        dog1.size = "Small";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Space";
        dog2.breed = "Akita Inu";
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.age = 2;
        dog2.color = "White/Red";

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Vetka", "Chepard", 1, 'M', "small", "White");
        System.out.println(dog3);

        dog1.eat();
        dog2.play();
        dog3.bark();

        System.out.println("-------------------------");

        Dog dog4 = new Dog();
        dog4.setInfo("Lolly", "PitBull", 4, 'F', "Small", "black");
        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Lablador", 6, 'M', "Large", "Black");



        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};




    }
}
