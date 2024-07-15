public class Main {
    public static void main(String[] args) {
        OrderProcess order1 = new OrderProcess("inpost");
        order1.processOrder("AS AS");
        OrderProcess order2 = new OrderProcess("standard");
        order2.processOrder("TEST");
        OrderProcess order3 = new OrderProcess("courier");
        order3.processOrder("TEST 2 ");
    }
}
