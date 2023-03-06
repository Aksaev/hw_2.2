// Пуффендуй
public class Hufflepuff extends Hogwarts {
    private int hardworking; // трудолюбие
    private int loyal; // верность
    private int honest; // честность

    public Hufflepuff(String name, int magic, int transgression, int hardworking, int loyal, int honest) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    // Сумма способностей (трудолюбие + верность + честность
    public int ability() {
        return hardworking + loyal + honest;
    }

    // Сравнение студентов Пуффендуй
    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability(); // Характеристики Студента 1
        int ability2 = ability(); // Характеристики Студента 2
        if (ability1 > ability2) {
            System.out.printf(
                    "Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    getName(),
                    hufflepuff.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    "Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    "Пуффендуец %s такой же, как пуффендуец %s: %d VS %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), hardworking, loyal, honest);
    }

}
