package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(400));

        }catch (Exception e){

           String description = e.getMessage(); // description of the impediment
            System.out.println(description);
        }

        System.out.println("======================================================");

        String result = "";

        try {
            System.out.println( 100 / 0);
            System.out.println("Try block");

        }catch (Exception e){
            System.out.println("Catch block");
//            String description = e.getMessage();
//            System.out.println(description);// System.out.println(e.getMessage())
            result = e.getMessage();
        }

        System.out.println(result);
        System.out.println("Completed");



    }


}
/*
testCase:
        step1
        step2
        step3
        step4
        ....
        step10

        if we have issue or impediment any step
        we basically ignore that step using the try & catch
        for a while it is ignoring..
        but if the description of problem is written, it is easy to work on it.

 */
