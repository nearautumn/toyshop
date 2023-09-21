package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

    public int getToysNumberFromUser() throws InputMismatchException{
        System.out.println("Введите количство игрушек: ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }

    public String getToyNameFromUser() {
        System.out.println("Введите название игрушки: ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.next();
        }
    }

    public int getToyCountFromUser() {
        System.out.println("Введите количество единиц игрушки: ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
}
