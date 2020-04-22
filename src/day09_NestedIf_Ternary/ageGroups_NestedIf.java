package day09_NestedIf_Ternary;
/*
write a program that can define the age groups of a person
             age groups are:
                    Teenager (<21),
                    Adult (>=21 && < 55),
                    Senior (> 55),
                    if age > 150 or less than 0 ==> invalid entry
 */
public class ageGroups_NestedIf {
    public static void main(String[] args) {
        int age = 9;
        String ageGroup = " ";
        if(age > 0 && age < 150) {
            if (age < 21) {
                ageGroup = "Teenager";
            } else if (age < 55) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }
        }else {
                ageGroup = "Invalid entry";
                }
            System.out.println(ageGroup);
        System.out.println("===============================");

        // How about with Ternary :
        int age2 = 45;
        String ageGroup2 = " ";

        if(age2 > 0 && age2 < 150){

            ageGroup2 = (age2 < 21)? "Teenager" :
                    (age2 < 55)? "Adult" : "Senior";

        }else {
            ageGroup2 = "Invalid Entry";
        }
        System.out.println(ageGroup2);



        }





    }

