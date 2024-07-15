package ZAD4;

public class Transport extends ExtrasDecorator {
    BaseOrder baseOrder;

    public Transport(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    public String getDescription() {
        return baseOrder.getDescription() + " Transport";
    }

    public double cost() {
        return baseOrder.cost() + 13;
    }
}
