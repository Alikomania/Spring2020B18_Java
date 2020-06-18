package day51_Recap;
/*
4. create a final class named circle that can inherit
from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
 */
public final class Circle extends Shape implements PI { // 3 variables

    public double radius;


    public Circle(double radius){
        this.radius = radius;
        name = "Circle";
    }


    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
