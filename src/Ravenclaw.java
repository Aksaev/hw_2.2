// Когтевран
public class Ravenclaw extends Hogwarts {
    private int clever; // умный
    private int wise; // мудрый
    private int witty; // остроумный
    private int creativity; // творческий

    public Ravenclaw(String name, int magic, int transgression, int clever, int wise, int witty, int creativity) {
        super(name, magic, transgression);
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    // Сумма способностей (умный + мудрый + остроумный + творческий)
    public int ability() {
        return clever + wise + witty + creativity;
    }

    // Сравнение студентов Когтевран
    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability(); // Характеристики Студента 1
        int ability2 = ability(); // Характеристики Студента 2
        if (ability1 > ability2) {
            System.out.printf(
                    "Когтевран %s лучше, чем когтевран %s: %d VS %d%n",
                    getName(),
                    ravenclaw.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    "Когтевран %s лучше, чем когтевран %s: %d VS %d%n",
                    ravenclaw.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    "Когтевран %s такой же, как когтевран %s: %d VS %d%n",
                    ravenclaw.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; остроумность: %d; творчество: %d", super.toString(), clever, wise, witty, creativity);
    }

}
