// Слизерин
public class Slytherin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int power; // жажда власти

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Сумма способностей (хитрость + решительность + амбициозность + находчивость + жажда власти)
    public int ability() {
        return cunning + determination + ambition + resourcefulness + power;
    }

    // Сравнение студентов Слизерин
    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability(); // Характеристики Студента 1
        int ability2 = ability(); // Характеристики Студента 2
        if (ability1 > ability2) {
            System.out.printf(
                    "Слизерин %s лучше, чем слизерин %s: %d VS %d%n",
                    getName(),
                    slytherin.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    "Слизерин %s лучше, чем слизерин %s: %d VS %d%n",
                    slytherin.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    "Слизерин %s такой же, как слизерин %s: %d VS %d%n",
                    slytherin.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d", super.toString(), cunning, determination, ambition, resourcefulness, power);
    }

}
