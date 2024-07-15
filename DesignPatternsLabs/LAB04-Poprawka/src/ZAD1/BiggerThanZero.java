package ZAD1;

public class BiggerThanZero implements Observer{
    private KeyboardInput keyboardInput;

    public BiggerThanZero(KeyboardInput keyboardInput) {
        this.keyboardInput = keyboardInput;
        keyboardInput.registerObserver(this);
    }

    @Override
    public void update(int value) {
        if(value > 0)
            System.out.println("Liczba jest większa od 0: " + value);
    }
}
