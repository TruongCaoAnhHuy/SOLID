package BadDesign;

public class TestMamal {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Mamal cat = new Cat();
        Mamal dog = new Dog();

        System.out.println("Cat say "+cat.makeNoise());
        System.out.println("Dog say "+dog.makeNoise());
    }
}
