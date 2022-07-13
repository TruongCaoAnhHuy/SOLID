package BetterDesign;

public class Cat {
    //composition
    CatNoise catNoise = new CatNoise();
    public String makeNoise(){
        return catNoise.makeNoise();
    }
}
