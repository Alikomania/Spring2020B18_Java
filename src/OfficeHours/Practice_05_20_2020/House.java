package OfficeHours.Practice_05_20_2020;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy", 4, "White", "Big", "German Shepperd");
    //    dog1.setInfo("Lucy", 4, "White", "Big", "German Shepperd");

        Dog dog2 = new Dog("Rindik", 5, "White", "Huge","Kangal");
        System.out.println(dog1);
        System.out.println(dog2);

        dog2.bark();
    //    dog2.scratch();

        System.out.println("========================================");

        Cat cat1 = new Cat("Bonbon", 2, "Brown", "Small", "Abyssinian");
    //    cat1.setInfo("Pamuk", 3, "Gray", "medium", "Van");
        System.out.println(cat1);

        cat1.scratch();
    //    cat1.bark();

        System.out.println("=======================================");

        Bunny bunny1 = new Bunny("Bug",3,"white","small","tiny");
        System.out.println(bunny1);

        bunny1.dig();



    }




}
