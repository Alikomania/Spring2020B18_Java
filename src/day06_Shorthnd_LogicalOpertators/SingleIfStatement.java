package day06_Shorthnd_LogicalOpertators;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWeather = true;
        if(coldWeather) {
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }

        boolean coronaDetected = false;
        if(coronaDetected) {
            System.out.println("Buy more toilet papers");

        }

        System.out.println("==================================");

        int a = 201;
        boolean evenNumber = a % 2 == 0;
      //  boolean oddNumber = a % 2 != 0;

        if(evenNumber){
            System.out.println(a + " is even number");
        }

        if(!evenNumber){
            System.out.println(a + " is odd number");
        }

        int x = 1;
        int y = 2;
        boolean greater = y > x == true;
        if(greater){

            System.out.println(y + " is greater");
        }
    }

}
