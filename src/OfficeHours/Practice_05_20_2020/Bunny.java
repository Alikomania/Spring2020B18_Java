package OfficeHours.Practice_05_20_2020;

public class Bunny extends Pet {

    public Bunny(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }

    public void dig(){
        System.out.println(name+" is digging");
    }

}
