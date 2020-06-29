package day54_Maps;

public class GarbageCollector {

    public static void main(String[] args) {

        GarbageCollector obj = new GarbageCollector(); // will not be collected by garbage collector
                                new GarbageCollector(); // will be collected by garbage collector

        System.out.println("Done");

        // unreferenced an object:

        String str = new String("Cybertek");
               str = new String("MIT");

        System.out.println(str); // MIT

        Integer num = new Integer(123);
                num = new Integer(124);

                // 123 will be collected by garbage collector

        Double n = new Double(0.5);
               n = null;

               // // 123 will be collected by garbage collector
        System.out.println(n); // null

    }

}
