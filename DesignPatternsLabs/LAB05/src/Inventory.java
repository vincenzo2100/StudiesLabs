import java.util.ArrayList;

public class Inventory implements Subject{
    ArrayList<Observer> observers ;
    ArrayList<String> items ;

    public Inventory() {
        this.observers = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    observers.remove(o);
    }


    public void notifyItemAdded(String item) {
        for (Observer observer : observers) {
            observer.onItemAdded(item);
        }
    }

    public void notifyItemRemoved(String item) {
        for (Observer observer : observers) {
            observer.onItemRemoved(item);
        }
    }
    public void addItem(String item) {
        items.add(item);
        notifyItemAdded(item);
    }

    public void removeItem(String item) {
        items.remove(item);
        notifyItemRemoved(item);
    }
    public ArrayList<String> getItems() {
        return items;
    }

}
