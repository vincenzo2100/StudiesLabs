package ZAD1;

public class DivisibleByTwoObserver implements Observer{
    private int value;
    @Override
    public void update(int value) {
        if (value % 2 == 0) {
            System.out.println("Liczba " + value + " jest podzielna przez 2.");
        }
    }
}
