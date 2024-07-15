package ZAD1;

public class GreatherThanZeroObserver implements Observer{
    @Override
    public void update(int value) {
        if (value > 0) {
            System.out.println("Liczba " + value + " jest większa od zera.");
        }
    }
}
