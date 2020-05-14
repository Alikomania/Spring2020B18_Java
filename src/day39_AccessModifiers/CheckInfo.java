package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);

            System.out.println("Grade: "+PersonalInfo.grade);
        System.out.println("AGe: "+PersonalInfo.age);

//        System.out.println("SSN: "+PersonalInfo.SSN); => Private is not accessable outside the class
//        System.out.println("ID: "+PersonalInfo.id); => Private is not accessable outside the class

        PersonalInfo obj = new PersonalInfo();
        System.out.println( obj.name );
        System.out.println( obj.gender );

        System.out.println( obj.grade );
        System.out.println( obj.age );

//        System.out.println( obj.SSN ); => Private is not accessable outside the class
//        System.out.println( obj.id ); => Private is not accessable outside the class

    }
}
