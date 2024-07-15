package ZAD4;

public class MainZAD4 {
    public static void main(String[] args) {
    BaseOrder order1 = new ClientOrder();
    order1 = new Ball(order1);
    order1 = new Ball(order1);
    order1 = new Pills(order1);
    order1 = new Trousers(order1);
    order1 = new Transport(order1);
        System.out.println(order1.getDescription() + " " + order1.cost() + " PLN");
        order1 = new Mascot(order1);
        order1 = new KeyChain(order1);
        order1 = new KeyChain(order1);
        System.out.println(order1.getDescription() + " " + order1.cost() + " PLN");
        order1 = new Discount(order1);
        System.out.println(order1.getDescription() + " " + order1.cost() + " PLN");

    }
}
