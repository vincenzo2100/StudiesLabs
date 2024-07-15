package ZAD3;

public class NoPineapple extends ToppingDecorator{
    Pizza pizza;

    public NoPineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", No Pineapple";
    }

    public double cost() {
        return pizza.cost() - 5;
    }
}
