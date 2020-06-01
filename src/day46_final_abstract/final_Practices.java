package day46_final_abstract;

public class final_Practices {

    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
    //    a = 20; => final keyword CANNOT BE REASSIGNED
    }

    static {
        System.out.println(b);
    //    b = 30; => final keyword CANNOT BE REASSIGNED
    }

 //Access modifier
    public final_Practices(){ // constructor

    }

    final void method1(){ // instance => access modifier (public) and final keyword can be replaced. BUT
                                // return type (void) HAVE TO before the method name (method1)

    }

    public final static void method2(){ // static

    }

    private final int method1(int a){
        return 123;
    }

    public static void method2(int a){

    }

}

class test extends final_Practices{
//    public final void method1(){
    //  'final' CANNOT be overriding
 //   }
}

final class test2 extends final_Practices{

}