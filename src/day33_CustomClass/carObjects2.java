package day33_CustomClass;

public class carObjects2 {
/*
        create 5 car objects, put them in array of cars
        use for loop to get each car info
        use for each loop to get each car info
         */

    public static void main(String[] args) {

        /*
            Car car1 = new Car();
            car1.Brand = "BMW";
            car1.model = "X5";
            car1.year = 2020;
            car1.color = "Black";

            System.out.println( car1.Brand ); // instance variables are object variables.
            // we can call them through the object name
            System.out.println(car1.model);
            System.out.println(car1.year);
            System.out.println(car1.color);

            car1.start(); // BMW is started
            car1.drive(); // Driving BMW X5
            car1.getCarInfo(); // 2020 BMW X5 Black

            System.out.println("===================================================");

            Car car2 = new Car();
            car2.Brand = "Toyota";
            car2.model = "Corolla";
            car2.year = 2020;
            car2.color = "White";

            System.out.println(car2.Brand);
            System.out.println(car2.model);
            System.out.println(car2.year);
            System.out.println(car2.color);

            car2.start(); // Toyota is started
            car2.drive(); // Driving Toyota Corolla
            car2.getCarInfo(); // 2020 Toyota Corolla White

            System.out.println("=========================================");

            Car car3 = new Car();

            car3.Brand = "Mercedes";
            car3.model = "C Class";
            car3.year = 2020;
            car3.color = "Black";

            car3.getCarInfo(); // 2020 Mercedes C Class Black
            car3.start(); // Mercedes is started
            car2.drive(); // Driving Toyota Corolla
            car3.drive(); // Driving Mercedes C Class

        Car car4 = new Car();

        car4.Brand = "Subaru";
        car4.model = "Outback";
        car4.year = 2020;
        car4.color = "Gray";

        car4.getCarInfo();
        car4.start();
        car4.drive();


        Car car5 = new Car();

        car5.Brand = "Ford";
        car5.model = "Mustang";
        car5.year = 2020;
        car5.color = "Blue";

        car5.getCarInfo();
        car5.start();
        car5.drive();

            System.out.println("===============================");

         */

        Car car1 = new Car();
        car1.setCarInfo("BMW", "X5", 2020, "Black");

        Car car2 = new Car();
        car2.setCarInfo("Toyota", "Corolla", 2020, "White");

        Car car3 = new Car();
        car3.setCarInfo("Mercedes", "C Class", 2020, "Red");

        Car car4 = new Car();
        car4.setCarInfo("Subaru", "Outback", 2020, "Gray");

        Car car5 = new Car();
        car5.setCarInfo("Ford", "Mustang", 2020, "Blue");


            Car[] cars = {car1, car2, car3, car4, car5};

            for (Car each : cars){
                each.getCarInfo();
            }

        System.out.println("===================================");

    //    System.out.println( car1 ); // day33_CustomClass.Car@1b6d3586

        System.out.println(car1); // 2020 BMW X5 Black ==> after we created the 'toString' method (at the Car Class)





    }
}
