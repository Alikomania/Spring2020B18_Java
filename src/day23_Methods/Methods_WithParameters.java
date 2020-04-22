package day23_Methods;

public class Methods_WithParameters {
    public static void main(String[] args) {

        EligibleToBuyAlcohol(21);


    }


    public static void EligibleToBuyAlcohol(int age) {

        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Eligible to buy milk");
        }





    }
}
