package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice2 {
    public static void main(String[] args) {
        byte age = 30;
        boolean eligibleToBuy = age > 21 || age == 21; // age >= 21

        if(eligibleToBuy){
            System.out.println("Here is your Vodka"); // Way 1
        }

        if(age>=21){
            System.out.println("Here is your Vodka"); // Way 2
          }
        if(age < 21){
            System.out.println("Go drink your milk"); // Way 1
        }
        if(!eligibleToBuy){
            System.out.println("Go drink your milk"); // Way 2
        }


        boolean feelingHappy = true;

        if(feelingHappy == false){
            System.out.println("don't be sad");
        }

        if(feelingHappy == true){
            System.out.println("Stay happy");
        }

    }

}
