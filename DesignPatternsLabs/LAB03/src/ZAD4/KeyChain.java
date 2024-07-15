package ZAD4;

public class KeyChain extends ExtrasDecorator {
    BaseOrder baseOrder;

    public KeyChain(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    public String getDescription() {
        return baseOrder.getDescription() + " Key Chain";
    }

    public double cost() {
        return baseOrder.cost() + 1;
    }
}
