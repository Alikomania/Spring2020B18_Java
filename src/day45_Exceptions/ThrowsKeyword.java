package day45_Exceptions;

public class ThrowsKeyword {

    public static void sleep1() {
    try {
        Thread.sleep(3000);
    } catch (Exception e){ }

    }

    public static void sleep2() throws InterruptedException {
        Thread.sleep(3000);
    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Cybertek");
        sleep1();
        System.out.println("Java");
        sleep2();
    }

    public static void sleep3() throws Exception { // we can use grandparents too

        Thread.sleep(3000);

    } // Disadvantage: The caller have to handling ('throws' keyword) again by itself, every time

    public static void method1() throws InterruptedException {
        String[] arr = {"A"};
        main(arr); // Even main method whoever calls that method that must be deal with handling 'throws' keyword
    }

    /*
    public static void method2(){
        method1(); ==> compile error
    }
      */

    public static void method2() throws InterruptedException {
        method1();
    }


}
