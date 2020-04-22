package day23_Methods;

public class Methods {

    /*
    step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
     */

    public static void main(String[] args) {
//Access-modifier(public) specifier(static) return-type(void) methodName()(main(String...)


        System.out.println("Hello Cybertek");
    printHello5Times();
        System.out.println("Hello Batch 18");
    printHello5Times();
        System.out.println("Hello Saim");
    printHello5Times();
        System.out.println("============================================");
    oddNumbers1_100();
    evenNumbers1_100();



    }

        public static void printHello5Times(){

        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }

    }


    public static void oddNumbers1_100(){
        int oddNum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                oddNum = i;
                System.out.print(oddNum+" ");
            }
        }
        System.out.println();

    }

    public static void evenNumbers1_100(){
        int evenNum = 0;
        for (int j = 1; j <= 100; j++){
            if (j % 2 == 0){
                evenNum = j;
                System.out.print(evenNum+" ");
            }
        }
    }


 /*
 step1: void method (without paramter)
 step2: void method (with parameter)
 step3: return method (without parameter)
 step4: return method (with parameter)
 step5: using the method different classes
 step6: overloading
 ...


  */

}
