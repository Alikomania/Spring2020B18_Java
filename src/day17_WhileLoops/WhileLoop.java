package day17_WhileLoops;

public class WhileLoop {
    public static void main(String[] args) {

        /*
      while (10>9){
            System.out.print("Hello World");
        }
*/
        for(int i = 0; i <= 5; i++){
        // initalizat; conditi; iterator
            System.out.println(i);
        }
        System.out.println("===============================");

// how convert while to for loop:
        int i = 0;
        while ( i <= 5 ){
        // ex.1 =>   i++; // 123456
            System.out.print(i);
            i++; // 012345 ==> iterator must be after the print statement. otherwise ex.1

        }
        System.out.println("=================================");


        if (true){
            System.out.println("Hello World");
        }



    }
}
