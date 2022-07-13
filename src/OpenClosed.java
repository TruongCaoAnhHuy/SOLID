public class OpenClosed {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rectangle r = new Rectangle(1, 2);
        CalculateAreas ca = new CalculateAreas();
        System.out.println("Area = "+ca.calcArea(r));
        Circle c = new Circle(3);
        System.out.println("Area = "+ca.calcArea(c));
    }
}
