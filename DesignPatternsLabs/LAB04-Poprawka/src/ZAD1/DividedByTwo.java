package ZAD1;

public class DividedByTwo implements Observer{
    private KeyboardInput keyboardInput;

    public DividedByTwo(KeyboardInput keyboardInput) {
        this.keyboardInput = keyboardInput;
        keyboardInput.registerObserver(this);
    }

    @Override
    public void update(int value) {
        if(value % 2 ==0)
            if(value != 0)
                System.out.println("Liczba podzielna przez 2: " + value);
    }
}
