package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method1();
    }

    public ConstructorCalls(int a){
    //    ConstructorCall; ==> we can't constructor like that, we need this() keyword.
        this();
    }

    public static void method1(){
    //  method2(); we can't call method2, because its not static. static (methods) accepts only static
    // ConstructorCall; => we can't call because same reason
    }

    public void method2(){
        method1(); // we can call method1, because its static method, which mean global
    }

}
