package model;

import model.Toy;

import java.util.Comparator;

public class RateComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy toy1, Toy toy2) {
        return (toy2.getRate() - toy1.getRate());
    }
}
