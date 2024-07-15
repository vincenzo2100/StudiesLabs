package ZAD1;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardInput implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();



    @Override
    public void addObserver(Observer observer) {
    observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObservers(int value) {
    for(Observer observer : observers)
        observer.update(value);
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Podaj liczbę (0 aby wybrać opcję): ");
                int number = scanner.nextInt();
                notifyObservers(number);
            } catch (Exception e) {
                System.out.println("Błąd: " + e.getMessage());
                break;
            }
        }
        scanner.close();
    }


}
