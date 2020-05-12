package day38_Constructors;

public class ConstructorCalls2 {
/*
Rules:
1. only constructor can call another constructor
2. In order to call a constructor in another
constructor ==> MUST use this() keyword (this() is used to call constructors)
    this(): can only be used in a constructor calling
    another constructor (DO NOT USE NAME OF CONSTRUCTOR)
3. Constructor call MUST be at FIRST step.
If we call at later step ==> Compiler error
4. A Constructor can call ONLY ONE Constructor.
If we call twice ==> Compiler error
5. A Constructor can NOT call ITSELF.
If it calls itself ==> Compiler error
6. A Constructor can NOT contain itself ==> Meaning if
a constructor called another,
the latter can not call the first (because of rule 5)
 */
    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a){
    //    System.out.println(20); constructor call needs to be at the first step. otherwise it gives compile error
        this(); // Default constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){
    //    this(); // Default constructor
        this(10); // Default & int argument
    //    this() ==> One constructor can only call one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj = new ConstructorCalls2(); // Default constructor
        ConstructorCalls2 obj1 = new ConstructorCalls2(10); // Default constructor
                                                            // Constructor with int argument

        System.out.println("==========================================================");

    //    ConstructorCalls2 obj2 = new ConstructorCalls2("Hello"); // Default constructor
                                                                // Constructor with String argument

        ConstructorCalls2 obj2 = new ConstructorCalls2("Hello"); // Default constructor
                                                                // Constructor with int argument
                                                                // Constructor with String argument





    }

    public void method1(){
    //   ConstructorCalls2(); only constructorCall can other constructor
    }


    {

    }


}
