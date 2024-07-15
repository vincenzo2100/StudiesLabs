package ZAD4;

public class Ball extends ProductDecorator {
    BaseOrder baseOrder;

    public Ball(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    public String getDescription() {
        return baseOrder.getDescription() + " Ball";
    }

    public double cost() {
        return baseOrder.cost() + 15;
    }
}
