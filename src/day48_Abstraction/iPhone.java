package day48_Abstraction;

public final class iPhone extends Phone {
    static {
        brand = "iPhone";
    }

    public iPhone(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting with "+phoneNumber);
    }

    public void FaceTiming(long phoneNumber){
        System.out.println("iPhone is FaceTiming with "+phoneNumber);
    }

}
