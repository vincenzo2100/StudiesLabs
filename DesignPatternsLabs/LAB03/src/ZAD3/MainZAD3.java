package ZAD3;

public class MainZAD3 {
    public static void main(String[] args) {
        Pizza pizza1 = new HamPizza();
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());
        pizza1 = new Tomato(pizza1);
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());
        pizza1 = new NoHam(pizza1);
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());

        Pizza pizza2 = new PineapplePizza();
        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());
        pizza2 = new Bacon(pizza2);
        pizza2 = new Tomato(pizza2);
        pizza2 = new Tomato(pizza2);
        pizza2 = new NoPineapple(pizza2);
        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());

    }

}
