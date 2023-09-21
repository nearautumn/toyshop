package model;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Model {

    private Queue<Toy> toyQueue;
    private Comparator<Toy> rateComparator;
    private int toysCount;

    public Model(Comparator<Toy> rateComparator, int toysCount) {
        this.rateComparator = rateComparator;
        this.toysCount = toysCount;
        toyQueue = new PriorityQueue<>(toysCount, rateComparator);
    }

    public String getWinner() {
        for (int i = 0; i < toysCount; i++) {
            toyQueue.add(new Toy());
        }
        try {
            return toyQueue.poll().toString();
        } catch (NullPointerException e) {
            throw new RuntimeException("В очереди нет объектов Toy");
        }
    }
}
