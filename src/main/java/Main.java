import model.RateComparator;
import model.Toy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Comparator<Toy> toyComparator = new RateComparator();
        Queue<Toy> queue = new PriorityQueue<>(10, toyComparator);

        for (int i = 0; i < 11; i++) {
            queue.add(new Toy());
        }

        System.out.println(queue);
        System.out.println(queue.poll());
    }
}
