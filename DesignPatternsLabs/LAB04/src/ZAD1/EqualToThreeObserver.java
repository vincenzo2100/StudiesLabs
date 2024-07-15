package ZAD1;

public class EqualToThreeObserver implements Observer{
    @Override
    public void update(int value) {
        if (value == 3) {
            System.out.println("Liczba jest równa 3.");
        }
    }
}
