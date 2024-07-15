package ZAD1;

import java.util.ArrayList;
import java.util.Scanner;

public class InputObserver implements Observer{

    private Observer observer;

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void update(int value) {
        if(value == 0)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Jakie liczby mają być wychwytywane przez program?");
            System.out.println("1.Liczba jest większa od zera");
            System.out.println("2.Liczba jest równa 3");
            System.out.println("3.Liczba jest podzielna przez 2");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    setObserver(new GreatherThanZeroObserver());
                    break;
                case 2:
                    setObserver(new EqualToThreeObserver());
                    break;
                case 3:
                    setObserver(new DivisibleByTwoObserver());
                    break;
                default:
                    System.out.println("Niepoprawna opcja.");
            }
        }else if(observer !=null)
        {
            observer.update(value);
        }


    }
}
