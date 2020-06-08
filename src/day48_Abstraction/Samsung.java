package day48_Abstraction;

public final class Samsung extends Phone {
    static {
        brand = "Samsung";
    }

    public Samsung (String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is calling with "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing  when using");
    }
}
