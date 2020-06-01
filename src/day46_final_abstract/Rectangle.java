package day46_final_abstract;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void Area(){
        double area = length * width;
        System.out.println("Area of the rectangle: "+area);
    }

}
