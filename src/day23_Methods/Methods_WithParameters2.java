package day23_Methods;

import com.sun.org.apache.regexp.internal.RE;

public class Methods_WithParameters2 {

        // task:
    //	create a function that can revers any string

    public static void main(String[] args) {

        String names = "Ali";
        ReverseString(names);

        String names2 = "Cybertek";
        ReverseString(names2);// Re-usable


    }

  public static void ReverseString(String str){

      for (int i = str.length()-1; i >= 0; i--){
          System.out.print(str.charAt(i));
      }
      System.out.println();

  }





}
