package ZAD1;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardInput implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private int value;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Podaj liczbę (0 aby wybrać opcję): ");
                value = scanner.nextInt();
                notifyObservers();
                if(value==0)
                {
                    System.out.println("Wybierz opcję:");
                    System.out.println("1.Liczba większa od 0");
                    System.out.println("2.Liczba podzielna przez 2");
                    System.out.println("3.Liczba równa 3");
                    Scanner scanner2 = new Scanner(System.in);
                    int option = scanner2.nextInt();
                    switch (option){
                        case 1:
                            new BiggerThanZero(this);
                            break;
                        case 2:
                            new DividedByTwo(this);
                            break;
                        case 3:
                            new EqualsThreeObserver(this);
                            break;
                        default:
                            System.out.println("Nie prawidłowa opcja");
                            break;
                }

            }

        }catch (Exception e)
            {
                System.out.println("Błąd: " + e.getMessage());
            }

    }


}}
