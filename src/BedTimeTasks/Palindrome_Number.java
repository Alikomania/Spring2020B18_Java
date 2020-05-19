package BedTimeTasks;
/*
write a method to check if a number is PALINDROME or Not
 => This can also be done using remainder (%) operator.

 */
public class Palindrome_Number {

    public static void main(String[] args) {
        long b=123454321;
        boolean res = palindromeNum(b);
        System.out.println(res);
    }
    public static boolean palindromeNum (long num){
        String n = Long.toString(num);
        String revNum= "";
        for (int i=n.length()-1; i >= 0; i--) {
            revNum +=""+n.charAt(i);
        }
        if (revNum.equals(n)) {
            return true;
        }
        return false;
    }

}
