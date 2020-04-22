package day23_Methods;

/*
warmup task:
	1.  Write a program that can print out the unique values
	 from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */

public class UniqueValues {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D", "E", "F", "B"};

        // solution1:

        for (String each : arr){

            int count2 = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i].equals(each)){
                    count2++;
                }
            }
            if (count2 == 1){
                System.out.println(each);
            }
        }

        System.out.println("===============================================");


        // solution3:

        for (int j = 0; j < arr.length; j++){

            int count2 = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i].equals(arr[j])){
                    count2++;
                }
            }
            if (count2 == 1){
                System.out.println(arr[j]);
            }
        }



        System.out.println("=======================================");

        // solution3:

        for (String each2 : arr){

            int count = 0;
            for (String each : arr){
                if (each.equals(each2)){
                    count++;
                }
            }
           if (count == 1){ // if the character is unique
                System.out.println(each2); // C D E F
            }

        }

/*
// outer loop will repeat as many times as length of array
// inner loop will repeat as many times as length of array to
compare each element to others
 */

    /*
    String str = "AAABBCC" => A3B2C2
    */
        String[] str = {"A", "B", "A", "C", "D", "E", "F", "B"};


    // LOOK AT => day 19 Frequency




    }
}
