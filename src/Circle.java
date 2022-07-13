public class Circle extends Shape {
    private double radius;

    public Circle(double r){
        radius = r;
    }

    public double calcArea() {
        // TODO Auto-generated method stub
        area = 3.14*(radius*radius);
        return (area);
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return radius*radius*3.14;
    }
}
