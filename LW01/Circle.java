package LW01;

public class Circle{
    double radious;

    Circle(double rad){
        radious = rad;
    }

    public double computeArea(){
        double area = Math.PI*radious*radious;
        return area;
    }

    public double computecircumference(){
        double circumference;
        circumference =2*Math.PI*radious;
        return circumference;
    }
}
