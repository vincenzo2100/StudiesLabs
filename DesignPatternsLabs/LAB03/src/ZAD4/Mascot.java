package ZAD4;

public class Mascot extends ExtrasDecorator {
    BaseOrder baseOrder;

    public Mascot(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    public String getDescription() {
        return baseOrder.getDescription() + " Mascot";
    }

    public double cost() {
        return baseOrder.cost();
    }
}
