package day10_Switch_Scanner;

public class SwitchStatementPractice_3 {
    /*
    - Create a new switch statement using char instead of int.
    - Create a new char variable
    - Create a switch statement testing for A, B, C, D or E
    - Display a message if any of these are found and then break
    - Add a default which displays a message saying not found
     */
    public static void main(String[] args) {

        char ch = 'C';
        String result = " ";

    switch (ch){
        case 'A':
            // System.out.println('A');
            result = "A";
            break;
        case 'B':
           // System.out.println('B');
            result = "B";
            break;
        case 'C':
           // System.out.println('C');
            result = "C";
            break;
        case 'D':
           // System.out.println('D');
            result = "D";
            break;
        case 'E':
           // System.out.println('E');
            result = "E";
            break;
        default:
           // System.out.println("not found");
            result = "Not found";
    }
        System.out.println(result);


    }
}
