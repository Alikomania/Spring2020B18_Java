package OfficeHours.Practice_05_27_2020;

public class methodOverriding {

    protected void method1(){ // access modifier MUST BE at least SAME or MORE VISIBLE
        System.out.println("Super class");
    }

}

class Test extends methodOverriding{

    public void method1(){ // access modifier MUST BE at least SAME or MORE VISIBLE
        System.out.println("Sub class");
    }

    public static void main(String[] args) {

        methodOverriding obj = new methodOverriding();
        obj.method1(); // super class

        Test obj1 = new Test();
        obj1.method1(); // sub class


    }




}
