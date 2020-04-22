package day10_Switch_Scanner;

public class NumberToWords {
    /*
    3. write a java program that can convert numbers
    between 0 ~ 9 to words, if the number is greater
    than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
     */
    public static void main(String[] args) {

        byte num = 12;
        String NumberToWords = " ";

        NumberToWords = (num == 0)? "Zero" :
                (num == 1)? "One" :
                    (num == 2)? "Two" :
                        (num == 3)? "Three" :
                                (num == 4)? "Four" :
                                        (num == 5)? "Five" :
                                                (num == 6)? "Six" :
                                                        (num == 7)? "Seven" :
                                                                (num == 8)? "Eight" :
                                                                        (num == 9)? "Nine" :
                                                                                "Invalid";
        System.out.println(NumberToWords);




    }
}
