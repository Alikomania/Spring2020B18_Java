package day44_Exceptions;

public class finally_Block {

    public static void main(String[] args) {

        try {
            System.out.println( 9 / 0 ); // after this exception executed jump the catch block.
            System.out.println("Try Block");
        } catch (Exception e){
            System.out.println("Catch Block");
        } finally { // always after the try & catch blocks. and always gets executed no matter what try & catch
            System.out.println("Finally");
        }



    }
}
