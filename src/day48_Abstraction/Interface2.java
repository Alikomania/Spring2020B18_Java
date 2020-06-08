package day48_Abstraction;

public interface Interface2 {

//    public Interface2 (){ }

//    public void method1(){ }

//    { }


// We don't need the gray one
    public static final int a = 100; // it is not instance variable.
                                     // because this is interface, not the class

    public static void main(String[] args) {

        System.out.println(a);// by default is STATIC als it is FINAL (which mean doesn't reassign)

    //    a = 200; ==> Cannot assign a value to final variable 'a'

        System.out.println( Interface2.a );
        Interface2.method4();

    }

    static void method4(){    } // static method

    void method5(); // abstract method

    default void method6(){ // default method
        System.out.println("Default method");
    }



}
