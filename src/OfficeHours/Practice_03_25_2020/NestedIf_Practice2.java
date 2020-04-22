package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
   /*
   for the loan:
   if he/she has a job that pays > 50000
   if he/she has good credit
   if job history more than or equal two years

 Needs:
   salary
   jobhistory
   creditscore
    */
        int salary = 45000;
        short creditscore = 750;
        byte jobHistory = 1;

        if (salary >= 50000) {
            if (creditscore > 650) {
                if (jobHistory >= 2) {
                    System.out.println("You are qualified");
                } else {
                    System.out.println("Comeback later");
                }
            } else {
                System.out.println("Not good credit");
            }

        } else {
            System.out.println("You need have a job that pays $50000");
        }
    }
}

