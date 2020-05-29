package OfficeHours.Practice_05_27_2020;

public class MethodOverloading {

    public void method(){ // access modifier (default, private, protected, public) does not matter same or not.
                        // return type (void, static, string... ) does not matter same or not.
                        // SAME METHOD NAME, DIFFERENT PARAMETER!
    }

     private String method(int a){ // access modifier (default, private, protected, public) does not matter same or not.
                        // return type (void, static, string... ) does not matter same or not.
                    // SAME METHOD NAME, DIFFERENT PARAMETER!

    return "123";
    }



    public static void method2(){

    }

    public static int method2(int a){
        return 123;
    }



    public MethodOverloading(){

    }

    public MethodOverloading(int a){

    }

    public MethodOverloading(int a, int b){

    }


    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int a) {
        System.out.println("int");
    }


}
