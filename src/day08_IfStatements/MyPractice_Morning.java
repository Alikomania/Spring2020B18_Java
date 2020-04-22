package day08_IfStatements;
/*
  Write a Java program to implement following
  logic using if-else statement
  1. if hour is less than 12 noon, greet with Good Morning
  2. if hour is greater than or equal 12 noon
  but less than 3 pm, greet with Good Afternoon
  3. if hour is greater than or equal to 3 pm,
  greet with Good Evening
 */
public class MyPractice_Morning {
    public static void main(String[] args) {

    double hour = 00.00;

    /* boolean AM = hour <= 12 && hour >= 0;
        boolean PM = hour > 12 && hour < 24;
        boolean earlyPM = hour >= 12 && hour < 15;
        boolean latePM = hour > 15 && hour < 24;
        boolean time = hour >= 0 || hour < 24;

     */

    String result = " ";

    if(hour <= 12 && hour >= 6){
        result = "Good morning";
    } else if(hour >= 12 && hour < 15){
        result = "Good afternoon";
    } else if(hour >= 15 && hour < 20){
        result = "Good evening";
    } else if(hour >= 20 && hour < 24 || hour >= 0 && hour < 6){
        result = "Good night";
    }
        System.out.println(result);

    }
}
/*
double hour = 23.59;
boolean AM= hour<=12 && hour>=0;
boolean PM= hour> 12 && hour<24;
boolean earlyPM= hour>=12 && hour<15;
boolean latePM= hour > 15 && hour<24;
boolean time = hour>=0 || hour <24;

  if(AM) {
    time=true;
    System.out.println("Good Morning");
} else  if (earlyPM){
    time=true;
    System.out.println("Good Afternoon");
}
  else if  (latePM) {
    time=true;
    System.out.println("Good Evening");
} else{
    System.out.println("Invalid input");
}
 */