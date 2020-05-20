package OfficeHours.Practice_05_20_2020;

public class Cat extends Pet {

    public Cat(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }

}
