package day16_ForLoop;

public class Quiz {
    public static void main(String[] args) {

        int i = 0;

        for(i = 5; i < 10;){// 1. 5+2 =>7 // 2. 7+2=> 9 // 3. 9+2=> 11
                            // (its end because bigger than 10; i must smaller 10 (i < 10)

            i += 2; // 11
        }
        System.out.println(i);

        System.out.println("=========================");

        String str = " ";

        System.out.println(str.trim().isEmpty()); // true
        //               "" (empty) . empty ==> // true

        System.out.println(str.isEmpty()); // false
        //        Because it doesn't re-assign the str.
        //        just print trim in the print statement  Still " " (there is space)



    }
}
