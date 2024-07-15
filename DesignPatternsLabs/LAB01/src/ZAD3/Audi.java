package ZAD3;

public class Audi implements Car{
    @Override
    public void showCarName() {
        System.out.println("Audi");
    }

    @Override
    public int getMaxSpeed() {
        return 160;
    }
}
