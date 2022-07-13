package Disolution;

public class MammalTestDrive {
    public static void main(String[] args) {
        //đa hình
        DogNoise dogNoise = new DogNoise();
        Mammal dog = new Mammal(dogNoise);
        dog.getSpeaker().makingNoise();

        CatNosie catNosie = new CatNosie();
        Mammal cat = new Mammal(catNosie);
        cat.getSpeaker().makingNoise();
    }
}
