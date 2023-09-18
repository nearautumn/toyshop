package model;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Toy {

    private UUID id;
    private String name;
    private int count;
    private int rate;
    private Random random = new Random();

    public Toy() {
        id = UUID.randomUUID();
        rate = random.nextInt(0, 101);
        name = "toy";
        count = 1;
    }

    public Toy(String name, int count) {

        this.name = name;
        this.count = count;
        id = UUID.randomUUID();
        rate = random.nextInt(0, 101);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return String.format("ID = %s; имя = %s; количество = %d; вес = %d", id.toString(), name, count, rate);
    }

}
