package day50_Polymorphism;

public class Encapsulation {

    private final String username = "MIT"; // if private data is final we CANNOT setter;
                              // we CAN ONLY generate getter. Because final is NOT modifiable.

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
    //    this.username = username;
    }

}

class Test{

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
    //    System.out.println( obj.username );
        System.out.println( obj.getUsername() ); // MIT

        obj.setUsername("Cybertek");

        System.out.println( obj.getUsername() ); // Cybertek

    }

}
