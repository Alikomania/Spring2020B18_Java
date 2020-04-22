package day21_MultiDimensionalArrays;

public class Emails_LunchBreakTask {
    public static void main(String[] args) {
/*
Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
        "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for (String eachEmails : emails){
            if(eachEmails.endsWith("@gmail.com")){
                continue;
            }
            System.out.println(eachEmails);
        }




    }
}
