public class Hogwarts {
    private String name; // имя ученика
    private int magic; // умение колдовать, сила магии
    private int transgression; // расстояние трансгресия

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    // Сумма способностей (магия + трансгрессия)
    private int ability() {
        return magic + transgression;
    }

    // Сравнение студентов Хогвартс
    public void compareHogwarts(Hogwarts hogwarts) {
        int ability1 = ability(); // Характеристики Студента 1
        int ability2 = ability(); // Характеристики Студента 2
        if (ability1 > ability2) {
            System.out.printf(
                    "Студент %s лучше, чем студент %s: %d VS %d%n",
                    getName(),
                    hogwarts.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    "Студент %s лучше, чем студент %s: %d VS %d%n",
                    hogwarts.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    "Студент %s такой же, как студент %s: %d VS %d%n",
                    hogwarts.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", name, magic, transgression);
    }

}
