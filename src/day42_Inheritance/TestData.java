package day42_Inheritance;

public class TestData extends Data {
    /*
    public: accessable at everywhere, visible to the world
	protected: visible in same package, visible in sub class of outside the package
	default: only visible in same package
	private: only visible within the same class

	*/
    /*
    public
    default
    protected
     */

    public static void main(String[] args) {

        System.out.println( TestData.publicData );
        System.out.println( TestData.protectedData );
        System.out.println( TestData.defaultData );
    //    System.out.println( TestData.privateData ); => Private can never inherited




    }

}
