public class Tamagotchi {
    private int hunger;
    private int energy;
    private int mood;

    public Tamagotchi(int hunger, int energy, int mood) {
        this.hunger = 4;
        this.energy = 4;
        this.mood = 4;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String play() {
        setHunger(this.hunger + 1);
        setMood(this.mood + 1);
        setEnergy(this.energy - 1);
        return (sleeping || energy == 0) ? "(-_-) zZZ" :
                (energy < 3) ? "(-_-)" :
                        (mood < 2) ? "ఠ_ఠ" :
                                (mood > 8) ? ":-)" :
                                        ":-|";

    }

    public void eat() {
        setHunger(this.hunger - 2);
        setEnergy(this.energy - 1);
    }

    public void sleep() {
        setEnergy(this.energy +2);
    }
}
