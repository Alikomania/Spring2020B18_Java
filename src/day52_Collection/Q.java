package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>(); // FIFO
        q.add("Ali");
        q.add("B");
        q.add("C");
        q.add("D");


        String str = q.poll(); // Ali
        System.out.println(str);


        String str1 = q.peek();
        System.out.println(str1);

        System.out.println(q);

        //System.out.println(q.get(0));



    }
}
