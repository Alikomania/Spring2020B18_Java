package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary = 120000;
        byte workHistory = 3;
        String result = " ";

        if(salary >= 30000) {
            if(workHistory >= 2) {
                result = "You are qualified for loan";
            } else {
                result = "You must have been on job at least 2 years";
            }
        } else {
            result = "You must earn at least $30.000";
        }
        System.out.println(result);


    }
}

