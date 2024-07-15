public class InpostShipping implements Shipping{
    @Override
    public void ship(String adress) {
        System.out.println("Wysyłka za pomocą paczkomatu na adres: " + adress);
    }
}
