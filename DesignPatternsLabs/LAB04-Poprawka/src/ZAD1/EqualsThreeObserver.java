package ZAD1;

public class EqualsThreeObserver implements Observer {
    private KeyboardInput keyboardInput;

    public EqualsThreeObserver(KeyboardInput keyboardInput) {
        this.keyboardInput = keyboardInput;
        keyboardInput.registerObserver(this);
    }

    @Override
    public void update(int value) {
        if (value == 3) {
            System.out.println("Liczba równa 3: " + value);
        }

    }
}
