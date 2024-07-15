package ZAD3;

public class Mercedes implements Car{
    @Override
    public void showCarName() {
        System.out.println("Mercedes");
    }

    @Override
    public int getMaxSpeed() {
        return 220;
    }
}
