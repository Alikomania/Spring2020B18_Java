package day41_Inheritance;

public class AudioBook extends Book{

    /*
    title (Inherited)
    author (Inherited)
    price (Inherited)
    length (declared)
    listen() (declared)
    toString() (Inherited)
     */

    public String length;

    public void listen(){
        System.out.println("Listening to "+title);
    }


}
