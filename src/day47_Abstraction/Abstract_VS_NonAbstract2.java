package day47_Abstraction;

abstract class A {
    public abstract void method1();
    public void method2() { }

}


public class Abstract_VS_NonAbstract2 extends A { // MANDATORY override the abstract method

    @Override
    public void method1() {

        // we have 2 method (this method1 and method2 from A) in this class. Not the abstract.
    }
}

abstract class B extends A { // optional to override the abstract method of A
// one abstract and one instance methods

}

class C extends B {

    @Override
    public void method1() {

    }

}
