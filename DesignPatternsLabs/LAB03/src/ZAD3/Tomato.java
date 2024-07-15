package ZAD3;

public class Tomato extends ToppingDecorator{
    Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    public double cost() {
        return 2 + pizza.cost();
    }
}
