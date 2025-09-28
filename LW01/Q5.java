package LW01;

public class Q5 {
    public static void main(String[] args) {
        Circle outerCircle= new Circle (21);
        Circle innerCircle= new Circle (7);

        double outercircleArea = outerCircle.computeArea();
        double innercircleArea = innerCircle.computeArea();
        double shadedArea = outercircleArea - innercircleArea;
        System.out.println("Shaded Area: " + shadedArea);
    }

}




