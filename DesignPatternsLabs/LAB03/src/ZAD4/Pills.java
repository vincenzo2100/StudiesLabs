package ZAD4;

public class Pills extends ProductDecorator{
    BaseOrder baseOrder;

    public Pills(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    public String getDescription() {
        return baseOrder.getDescription() + " Pills";
    }

    public double cost() {
        return baseOrder.cost() + 30;
    }
}
