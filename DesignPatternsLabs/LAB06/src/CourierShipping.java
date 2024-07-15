public class CourierShipping implements Shipping{
    @Override
    public void ship(String adress) {
        System.out.println("Wysyłka za pomocą kuriera na adres: " + adress);
    }
}
