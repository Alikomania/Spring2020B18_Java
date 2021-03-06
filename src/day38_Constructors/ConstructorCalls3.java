package day38_Constructors;

public class ConstructorCalls3 {

    /*
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

    public ConstructorCalls3(){
        this(9); // int argument
        System.out.println("default");
    }

    public ConstructorCalls3(int a){
    //    this(10); ==> Constructor cannot call itself or contain
    //    this(); ==> Constructor cannot call itself or contain
        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str){
    //    this("Hello"); ==> Constructor cannot call itself or contain
    }

    public static void main(String[] args) {

        new ConstructorCalls3(); // Int argument & default

    }



    public void method1(){

    }

}
