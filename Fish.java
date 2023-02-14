package sem2;

public class Fish extends Herbivores implements Swimming {
    public Fish(String nickname) {
        super(nickname);

    }

    @Override
    public int speedSwimming() {
        return 20;
    }

    public String toString() {
        return "I'm Fish. " + super.toString() + ". My speed is " + speedSwimming();
    }

    @Override
    public String say() {
        return null;
    }
}