public class Voice {
    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    private void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Goat();
        animals[2] = new Pig();
        animals[3] = new Tiger();
        animals[4] = new Lion();
        this.animals = animals;
    }

    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }

    private Animal[] animals;
}
