package Resources;

import day42_Inheritance.Accessmodifiers;

public class Inheritance2 extends Accessmodifiers {
//              sub                 super
    /*
    publicVariable
    protectedVariable

    publicMethod()
    protectedMethod()
     */

    public static void main(String[] args) {

        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();


    }


}
