package day16_ForLoop;
import java.util.*;
public class replit_47_RealEstateCalculator {
    public static void main(String[] args) {

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        System.out.println("Do you have backyard?");
        backyard = scan.nextBoolean();
        if(houseType.equalsIgnoreCase("Condo")){
            System.out.println("Backyard is not available for condo!");
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
         if (garage) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots <= 10) {
                for (int z = 1; z <= garageSpots; z++) {
                    propertyPrice += 20000;
                }
            } else {
                System.out.println("Pardon, it's not a public parking!");
            }
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();

        if (houseType.equalsIgnoreCase("Condo")){
            propertyPrice += 50000;
        } else if (houseType.equalsIgnoreCase("Townhouse")){
            propertyPrice += 75000;
        } else if (houseType.equalsIgnoreCase("Single Family Home")){
            propertyPrice += 95000;
        }
        for(int i = 1; i <= numberOfBedrooms; i++){
            propertyPrice += 30000;
        }
        if (backyard && !houseType.equalsIgnoreCase("Condo")){
            propertyPrice += 5000;
        }
        if (metroAccessibility <= 1){
            propertyPrice += 10000;
        } else {
            propertyPrice += 5000;
        }
        if (highwayAccessibility <= 1){
            propertyPrice += 15000;
        } else if(highwayAccessibility >1 && highwayAccessibility <= 5) {
            propertyPrice += 8000;
        } else {
            propertyPrice += 4000;
        }
        if (schoolScore <= 10 && schoolScore >= 8){
            propertyPrice += 45000;
        }else if (schoolScore < 8 && schoolScore >= 4){
            propertyPrice += 20000;
        }else {
            propertyPrice += 5000;
        }
        if (smoking){
            propertyPrice -= 5000;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");


    }
}
