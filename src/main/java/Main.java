import controller.ToyShop;
import model.RateComparator;
import model.Toy;
import view.View;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Comparator<Toy> toyComparator = new RateComparator();
        View view = new View();

        ToyShop toyShop = new ToyShop(toyComparator, view);
        toyShop.initRaffle();
    }
}
