package BedTimeTasks;
import java.util.ArrayList;
import java.util.Arrays;
public class MoveZero {

/*
      Write a program that can move all the zeros to
      last indexes of ArrayList
Ex:
   list:  {1,0,2,0,3,0,4,0};
   output: [1, 2, 3, 4, 0, 0, 0, 0]
   DO NOT USE SORT method
       */

    public static void main(String[] args) {


    ArrayList<Integer> list = new ArrayList<>((Arrays.asList(0,0,2,0,3,0,4,0)));
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(0)){
                list.remove(list.get(i));
                list.add(0);
            }
        }
        System.out.println(list); // [2, 3, 4, 0, 0, 0, 0, 0]

    }
}
