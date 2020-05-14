package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2020, 35000);
        Car car2 = new Car("BMW", "X6", 2020, 45000);
        Car car3 = new Car("Lexus", "RX", 2020, 40000);
        Car car4 = new Car("Tesla", "Model 3", 2020, 40000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);


    }

}
