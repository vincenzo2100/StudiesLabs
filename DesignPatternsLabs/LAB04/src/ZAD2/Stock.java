package ZAD2;



import java.util.ArrayList;
import java.util.Random;

public class Stock implements Subject {
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
    public void notifyObservers(double companyPrice) {
        for(Observer observer : observers)
        {
            observer.update(companyPrice);
        }
    }

    public void setStockPrice(double companyPrice) {

        notifyObservers(companyPrice);
    }
}
