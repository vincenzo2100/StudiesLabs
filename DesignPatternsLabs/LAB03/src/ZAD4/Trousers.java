package ZAD4;

public class Trousers extends ProductDecorator{
    BaseOrder baseOrder;

    public Trousers(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    public String getDescription() {
        return baseOrder.getDescription() + " Trousers";
    }

    public double cost() {
        return baseOrder.cost() + 50;
    }
}
