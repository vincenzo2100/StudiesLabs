package ZAD2;



import java.util.ArrayList;
import java.util.Random;

public class Stock implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String companyName) {
        for(ZAD2.Observer observer : observers)
        {
            double newPrice = generateRandomPrice();
            observer.update(companyName,newPrice);
        }

    }

    public void setCompanyPrice(String companyName)
    {
        notifyObservers(companyName);
    }

    private double generateRandomPrice() {
        Random random = new Random();
        return 50 + (200 - 50) * random.nextDouble();
    }
}
