public class StandardShipping implements  Shipping{
    @Override
    public void ship(String adress) {
        System.out.println("Wysyłka za pomocą standardowej poczty na adres: " + adress);
    }
}
