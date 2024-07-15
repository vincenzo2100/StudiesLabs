package ZAD3Correction;

import java.util.ArrayList;

public class MainZAD3Correction {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(new CarName1(),new CarSpeed1()));
        cars.add(new Car(new CarName2(),new CarSpeed2()));

        for(Car a:cars)
        {
            a.showCarName();
            System.out.println(a.getMaxSpeed());
        }
    }


}
