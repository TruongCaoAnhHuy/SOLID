package BetterDesign;

public class Dog {
    //composition
    DogNoise dogNoise = new DogNoise();
    public String makeNoise(){
        return dogNoise.makeNoise();
    }
}
