public class Tamagotchi {
    private int hunger;
    private int energy;
    private int mood;

    public Tamagotchi(int hunger, int energy, int mood) {
        this.hunger = 4;
        this.energy = 4;
        this.mood = 4;
    }

    public Tamagotchi() {
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

        if (energy == 0) {
            return "(-_-) zZZ";
        } else if (energy < 3) {
            return "(-_-)";
        } else if (mood < 2) {
            return "ఠ_ఠ";
        } else if (mood > 8) {
            return ":-)";
        } else {
            return ":-|";
        }

    }

    public String eat() {
        setHunger(this.hunger - 2);
        setEnergy(this.energy - 1);

        if (energy == 0) {
            return "(-_-) zZZ";
        } else if (energy < 3) {
            return "(-_-)";
        } else if (mood < 2) {
            return "ఠ_ఠ";
        } else if (mood > 8) {
            return ":-)";
        } else {
            return ":-|";
        }
    }

    public String sleep() {
        setEnergy(this.energy +2);
        return "(-_-) zZZ";
    }

    @Override
    public String toString() {
        if (energy == 0) {
            return "(-_-) zZZ";
        } else if (energy < 3) {
            return "(-_-)";
        } else if (mood < 2) {
            return "ఠ_ఠ";
        } else if (mood > 8) {
            return ":-)";
        } else {
            return ":-|";
        }
    }
}
