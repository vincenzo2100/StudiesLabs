package ZAD3;

import java.util.ArrayList;

public class MainZAD3 {
    public static void main(String[] args) {
        ArrayList<CarSpeed> cars = new ArrayList<>();

        cars.add(new CarSpeed(new Golf4()));
        cars.add(new CarSpeed(new Audi()));
        cars.add(new CarSpeed(new Mercedes()));

        for(CarSpeed a:cars)
        {
            a.showCarName();
            System.out.println(a.getMaxSpeed());

        }

    }
}
