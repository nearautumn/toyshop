package model;

import java.util.Random;
import java.util.UUID;

public class Toy {

    private UUID id;
    private String name;
    private int count;
    private int rate;
    private final Random random = new Random();
    private final String[] toyNames = new String[] {"Soldier", "Doll", "Car", "Lego"};

    public Toy() {
        id = UUID.randomUUID();
        rate = random.nextInt(0, 101);
        name = toyNames[random.nextInt(0, toyNames.length)];
        count = random.nextInt(1, 11);
    }

    public Toy(String name, int count) {

        this.name = name;
        this.count = count;
        id = UUID.randomUUID();
        rate = random.nextInt(0, 101);
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return String.format("ID = %s; имя = %s; количество = %d; вес = %d", id.toString(), name, count, rate);
    }

}
