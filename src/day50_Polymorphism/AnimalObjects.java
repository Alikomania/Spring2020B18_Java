package day50_Polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog obj1 = new Dog("Lucy", "Female", 5);
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2 = new Dog("Kito", "Female", 6);
        System.out.println(obj2.age);
        obj2.eat();
        obj2.sleep();

        obj2.methodA();
        obj1.methodA(4);

        Animal animal1 = new Cat("A", "F", 1);

        boolean isCat = animal1 instanceof Cat;
        if (animal1 instanceof Cat){
            System.out.println("is Cat");
        } else {
            System.out.println("is NOT Cat");
        }
        System.out.println(isCat);

        Dog d1 = new Dog("Athos", "M", 2);

    //    boolean r1 = d1 instanceof Cat; // There is NO is a relation dog and cat.
                                        // "Cat IS NOT a dog"

        Animal d2 = new Dog("Porthos", "M", 2);
        boolean r2 = d2 instanceof Cat; // "Cat IS animal"

        Animal animal2 = new Cat("Aramis", "M", 3);
        boolean r3 = animal2 instanceof Animal; // "Animal IS animal"

    }
}
