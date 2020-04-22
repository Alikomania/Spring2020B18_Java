package day14_StringClass;
import java.util.*;

public class repl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Do you want split");
        String split = s.next();

        System.out.println("Number of people");
        int numberOfPeople = s.nextInt();
        System.out.println("Enter check amount");
        double checkAmount = s.nextDouble();
        System.out.println("Enter service quality");
        String serviceQuality = s.next();

        boolean poor= serviceQuality.equalsIgnoreCase("poor");
        boolean fair= serviceQuality.equalsIgnoreCase("fair");
        boolean good= serviceQuality.equalsIgnoreCase("good");
        boolean great = serviceQuality.equalsIgnoreCase("great");
        boolean excellent=serviceQuality.equalsIgnoreCase("excellent");

        double totalTip = 0;
        if(serviceQuality.equals("Excellent")) {
            totalTip = checkAmount / 4;
        } else if (serviceQuality.equals("Great")){
            totalTip = checkAmount / 5;
        } else if (serviceQuality.equals("Good")){
            totalTip = checkAmount * 15 / 100;
        } else if (serviceQuality.equals("Fair")){
            totalTip = checkAmount / 10;
        } else if (serviceQuality.equals("Poor")){
            totalTip = checkAmount / 20;
        }

        double totalToPay = totalTip + checkAmount;
        double totalPerPerson = totalToPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;

        if(split.equals("Yes")){
            System.out.println("Number of people entered: "+numberOfPeople);
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);


        } else {
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total to tip: "+totalTip);

        }

        System.out.println("=============================");
/*
Alternate solution:

public class Main {
public static void main(String[] args) {
//WRITE YOUR CODE HERE
Scanner scan=new Scanner(System.in);
System.out.println("Split:");
String split = scan.next();
System.out.println("Number of people:");
int people = scan.nextInt();
System.out.println("Check amount:");
double amount = scan.nextDouble();
System.out.println("Service Quality:");
String service = scan.next();
String peoplenumber = (people == 1) ? "&" : (people == 2) ? "&&"
: (people== 3) ? "&&&" : (people== 4) ? "&&&&"
: (people == 5) ? "&&&&&" : "";
System.out.println("Number of people entered: " +peoplenumber);
String service1 = "Poor";
String service2 = "Fair";
String service3 = "Good";
String service4 = "Great";
String service5 = "Excellent";
if (service.equals(service1)) {
double totaltip = amount * 5 / 100;
double totaltopay=totaltip+amount;
double totalperperson=totaltopay/people;
double tipperperson=totaltip/people;
System.out.println("Total to pay: "+totaltopay);
System.out.println("Total tip: " + totaltip);
System.out.println("Total per person: "+totalperperson);
System.out.println("Tip per person: "+tipperperson);
} else if (service.equals(service2)) {
double totaltip = amount * 10 / 100;
double totaltopay=totaltip+amount;
double totalperperson=totaltopay/people;
double tipperperson=totaltip/people;
System.out.println("Total to pay: "+totaltopay);
System.out.println("Total tip: " + totaltip);
System.out.println("Total per person: "+totalperperson);
System.out.println("Tip per person: "+tipperperson);
} else if (service.equals(service3)) {
double totaltip = amount * 15 / 100;
double totaltopay=totaltip+amount;
double totalperperson=totaltopay/people;
double tipperperson=totaltip/people;
System.out.println("Total to pay: "+totaltopay);
System.out.println("Total tip: " + totaltip);
System.out.println("Total per person: "+totalperperson);
System.out.println("Tip per person: "+tipperperson);
} else if (service.equals(service4)) {
double totaltip = amount * 20 /100;
double totaltopay=totaltip+amount;
double totalperperson=totaltopay/people;
double tipperperson=totaltip/people;
System.out.println("Total to pay: "+totaltopay);
System.out.println("Total tip: " + totaltip);
System.out.println("Total per person: "+totalperperson);
System.out.println("Tip per person: "+tipperperson);
} else {
double totaltip = amount * 25 / 100;
double totaltopay=totaltip+amount;
double totalperperson=totaltopay/people;
double tipperperson=totaltip/people;
System.out.println("Total to pay: "+totaltopay);
System.out.println("Total tip: " + totaltip);
System.out.println("Total per person: "+totalperperson);
System.out.println("Tip per person: "+tipperperson);
}
}
}
 */




    }


}


/*
System.out.println("Split:");
        String split = s.next();

        System.out.println("Number of people:");
        int numberOfPeople = s.nextInt();
        System.out.println("Check amount:");
        double checkAmount = s.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = s.next();

        boolean poor= serviceQuality.equalsIgnoreCase("poor");
        boolean fair= serviceQuality.equalsIgnoreCase("fair");
        boolean good= serviceQuality.equalsIgnoreCase("good");
        boolean great = serviceQuality.equalsIgnoreCase("great");
        boolean excellent=serviceQuality.equalsIgnoreCase("excellent");

        double totalTip = 0;
        if(serviceQuality.equals("Excellent")) {
            totalTip = checkAmount / 4;
        } else if (serviceQuality.equals("Great")){
            totalTip = checkAmount / 5;
        } else if (serviceQuality.equals("Good")){
            totalTip = checkAmount * 15 / 100;
        } else if (serviceQuality.equals("Fair")){
            totalTip = checkAmount / 10;
        } else if (serviceQuality.equals("Poor")){
            totalTip = checkAmount / 20;
        }

        double totalToPay = totalTip + checkAmount;
        double totalPerPerson = totalToPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;

        if(split.equals("Yes")){
            System.out.println("Number of people entered:");
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);


        } else {
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total to tip: "+totalTip);

        }






 */