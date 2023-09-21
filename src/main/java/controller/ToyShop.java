package controller;

import model.FileSaver;
import model.Model;
import model.Toy;
import view.View;

import java.util.Comparator;

public class ToyShop {

    private Comparator<Toy> rateComparator;
    private View view;
    private Model model;
    private FileSaver fileSaver;

    public ToyShop(Comparator<Toy> rateComparator, View view) {
        this.rateComparator = rateComparator;
        this.view = view;
    }

    public void initRaffle() {
        int toysCount = view.getToysNumberFromUser();
        if (toysCount <= 0) {
            System.out.println("Количество игрушек введено неверно");
        } else {
            model = new Model(rateComparator, toysCount);
            fileSaver = new FileSaver();
            fileSaver.saveFile(model.getWinner());
        }
    }
}
