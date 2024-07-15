package ZAD3Correction;

public class Car {
CarName carName;
CarSpeed carSpeed;

    public Car(CarName carName, CarSpeed carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }

    public void showCarName()
    {
        carName.getCarName();
    }

    public int getMaxSpeed(){
        return carSpeed.getMaxSpeed();
    }
}
