public class TestShape {
    public static void main(String[] args) {
        System.out.println("Hello word!");

        Circle circle = new Circle(1);

        Shape[] shapeArray = new Shape[1];
        shapeArray[0] = circle;

        //CalculateAreas ca = new CalculateAreas(shapeArray);

        CalculateAreas sum = new CalculateAreas(shapeArray);
        OutputAreas oAreas = new OutputAreas(sum.sumAreas());
        //ca.sumAreas();
        //ca.output();

        oAreas.console();
        System.out.println("");
        oAreas.HTML();
    }
}
