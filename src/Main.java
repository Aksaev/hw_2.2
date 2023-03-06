import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Gryffindor harry = generateGryffindor("Гарри Поттер");
        Gryffindor hermione = generateGryffindor("Гермиона Грейнджер");
        Gryffindor ron = generateGryffindor("Рон Уизли");

        Slytherin draco = generateSlytherin("Драко Малфой");
        Slytherin graham = generateSlytherin("Грэхэм Монтегю");
        Slytherin gregory = generateSlytherin("Грегори Гойл");

        Hufflepuff zachariah = generateHufflepuff("Захария Смит");
        Hufflepuff cedric = generateHufflepuff("Седрик Диггори");
        Hufflepuff justin = generateHufflepuff("Джастин Финч-Флетчли");

        Ravenclaw zhou = generateRavenclaw("Чжоу Чанг");
        Ravenclaw padma = generateRavenclaw("Падма Патил");
        Ravenclaw marcus = generateRavenclaw("Маркус Белби");

        harry.print();
        hermione.print();
        ron.print();

        draco.print();
        graham.print();
        gregory.print();

        zachariah.print();
        cedric.print();
        justin.print();

        zhou.print();
        padma.print();
        marcus.print();

        harry.compareHogwarts(draco);
        harry.compareGryffindor(ron);

    }

    private static Gryffindor generateGryffindor(String name) {
        return new Gryffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Hufflepuff generateHufflepuff(String name) {
        return new Hufflepuff(
                name,

                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Ravenclaw generateRavenclaw(String name) {
        return new Ravenclaw(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slytherin generateSlytherin(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }


}