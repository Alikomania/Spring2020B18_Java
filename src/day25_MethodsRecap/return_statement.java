package day25_MethodsRecap;

public class return_statement {

    public static void main(String[] args) {

        /*
        if (10 > 9){
            return; // exits the current method only
        }
        System.out.println("Hello");

         */

        method2();

        System.out.println("Hello");

    }

    public static void method1(){

        if (10 > 9){
            return; // only exit the current method. not the main method ( in case void method)
        }
        System.out.println("Hello Cybertek");
    }

    public static void method2(){
        if (10 > 9){
           System.exit(0);
        }
        System.out.println("Hello Cybertek");

    }

}
