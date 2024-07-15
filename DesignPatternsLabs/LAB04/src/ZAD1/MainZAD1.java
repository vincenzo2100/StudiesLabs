package ZAD1;

public class MainZAD1 {
    public static void main(String[] args) {
        KeyboardInput keyboard = new KeyboardInput();
        keyboard.addObserver(new InputObserver());
        keyboard.readInput();
    }
}

