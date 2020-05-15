package Resources;

import day39_AccessModifiers.PersonalInfo;

public class checkInfo {

    public static void main(String[] args) {

        System.out.println( PersonalInfo.name);
        System.out.println( PersonalInfo.gender );

    //    System.out.println( PersonalInfo.grade ); // default is not accessable outside the package
    //    System.out.println( PersonalInfo.age ); // default is not accessable outside the package

        //    System.out.println( PersonalInfo.SSN );
        //    System.out.println( PersonalInfo.id );

        PersonalInfo obj = new PersonalInfo();

        System.out.println( obj.name );
        System.out.println( obj.gender );

    //    System.out.println( obj.grade ); => -even call the through by object- default is not accessable outside the package
    //    System.out.println( obj.age ); => -even call the through by object- default is not accessable outside the package

    //    System.out.println( obj.SSN ); => -even call the through by object- Private is not accessable outside the class
    //    System.out.println( obj.id ); => -even call the through by object- Private is not accessable outside the class


    }


}
