package day50_Polymorphism;

import java.security.DigestException;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        int a = 100;
        double b = a; // implicitly done. Smaller always assign to larger automatically

        Dog dog = new Dog("Polar", "F", 3);
        Animal animal1 = dog; // upCasting, done implicitly

        Cat cat = new Cat("Snow", "F", 4);
    //    Dog dog2 = (Dog)cat; MUST be IS A RELATION

        Animal animal2 = (Animal)cat; // upCasting, done implicitly.
                                    // but we write manually which is unnecessary => LINE 11

        System.out.println("==============================================================");

        double c = 10;
        int d = (int)c; // explicitly done. Larger to smaller. You HAVE TO DO manually

        Animal animal3 = new Dog("D'Artagnan", "M", 6);

        Dog dog3 = (Dog) animal3; // down casting, MUST BE done manually

        Animal animal4 = new Cat("Pamuk", "M", 7);
        Cat cat2 = (Cat) animal4; // down casting

        System.out.println("==========================================================");

        // What is the benefit of down casting in polymorphism?

        Animal animal5 = new Dog("Duman", "M", 6);
    //    animal5.bark();
        Dog dog2 = (Dog)animal5;
        dog2.bark();

        // second way
        ((Dog) animal5).bark();


        //SHORTCUT for down casting

    //    Dog dog4 = animal5;
        Dog dog4 = (Dog) animal5; // after alt + ENTER
        ((Dog) animal5).bark();





    }
}
