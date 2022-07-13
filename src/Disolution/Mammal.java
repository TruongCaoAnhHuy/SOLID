package Disolution;

public class Mammal {
    private MakingNoise speaker;

    public Mammal(){}

    public Mammal(MakingNoise sb){
        this.speaker = sb;
    }

    public MakingNoise getSpeaker() {
        return speaker;
    }
    public void setSpeaker(MakingNoise speaker) {
        this.speaker = speaker;
    }
}
