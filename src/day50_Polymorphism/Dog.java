package day50_Polymorphism;
/*
3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public final class Dog extends Animal { // 3 variables, 3 methods

    public String dogName;

    public Dog (String dogName, String gender, int age){
        this.dogName = dogName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Dog "+ dogName + " is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog " + dogName + " is sleeping");
    }

    public void bark(){
        System.out.println("Dog " + dogName + " is barking");
    }

    public static void methodA(int a){ // overloading method
        System.out.println("Dog Class A");
    }

}
