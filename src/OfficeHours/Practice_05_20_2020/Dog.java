package OfficeHours.Practice_05_20_2020;

public class Dog extends Pet {


    public Dog(String name, int age, String color, String size, String breed){
        this.setInfo(name, age, color, size, breed);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

}
