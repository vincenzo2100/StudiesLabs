package ZAD3;

public class Golf4 implements Car{
    @Override
    public void showCarName() {
        System.out.println("Golf 4");
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }
}
