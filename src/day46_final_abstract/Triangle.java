package day46_final_abstract;

public class Triangle extends Shape {


    public double base;
    public double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void Area(){
    double area = base * height * 1/2;
        System.out.println("Area of the triangle: "+area);
    }
}
