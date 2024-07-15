package ZAD3;

public class NoHam extends ToppingDecorator{
    Pizza pizza;

    public NoHam(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", NoHam";
    }

    public double cost() {
        return pizza.cost() - 5;
    }
}
