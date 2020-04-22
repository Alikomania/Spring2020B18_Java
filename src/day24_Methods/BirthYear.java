package day24_Methods;

public class BirthYear {


    public static void Age(int birthYear){ // 2000
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if (age > 0 && birthYear > 100){

            System.out.println(age);
        } else {
            System.out.println("Invalid");
        }


    }

    public static void main(String[] args) {

     //   int a = 2030;
    //    Age(a);

        printHelloCybertek();


    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek (){
        printHello();
        printCybertek();
    }


}
