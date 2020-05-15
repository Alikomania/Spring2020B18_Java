package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {
        Credentials AnnaFacebook = new Credentials();

        AnnaFacebook.setUserName("A.palura");
        AnnaFacebook.setPassWord("123456");

        System.out.println( AnnaFacebook.getUserName());
        System.out.println( AnnaFacebook.getPassWord());



    }

}
