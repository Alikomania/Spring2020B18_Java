package day44_Exceptions;
import java.util.NoSuchElementException;
public class multi_catchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println( 100 / 0);

        }catch (ClassCastException e){
            System.out.println("Class Cast");

        } catch (NoSuchElementException e){
            System.out.println("No such element");

        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of Bound");

        }catch (ArithmeticException e){
            System.out.println("Arithmetic");
        }

        // ==> Parents class CANNOT be before the child class







    }




}
