public class OrderProcess {
    private Shipping shipping;

    public OrderProcess(String shippingMethod){
        this.shipping = ShippingFactory.getShippingMethod(shippingMethod);
    }

    public void processOrder(String address){
        shipping.ship(address);
    }
}
