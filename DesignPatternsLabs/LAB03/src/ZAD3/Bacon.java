package ZAD3;

public class Bacon extends ToppingDecorator {
    Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Bacon";
    }

    public double cost() {
        return 2 + pizza.cost();
    }
}
