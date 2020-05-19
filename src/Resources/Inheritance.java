package Resources;
/*
    public: accessable at everywhere, visible to the world
	protected: visible in same package, visible in sub class of outside the package
	        protected is ALWAYS visible to any subclass
	default: only visible in same package
	private: only visible within the same class

	*/
import day42_Inheritance.Data;

public class Inheritance extends Data {
//              sub             super

    public static void main(String[] args) {

        System.out.println( Inheritance.publicData );
        System.out.println( Inheritance.protectedData );
    //    System.out.println( Inheritance.defaultData ); => ONLY in the SAME PACKAGE visible
    //    System.out.println( Inheritance.privateData ); => ONLY in the SAME CLASS visible



    }





}
