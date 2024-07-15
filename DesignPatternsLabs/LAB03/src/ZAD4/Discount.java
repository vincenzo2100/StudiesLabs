package ZAD4;

public class Discount extends ExtrasDecorator {
    BaseOrder baseOrder;

    public Discount(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    public String getDescription() {
        return baseOrder.getDescription() + " Discount";
    }

    public double cost() {
        return baseOrder.cost() <= 0 ?  0 : baseOrder.cost() - 10.0;


    }
}
