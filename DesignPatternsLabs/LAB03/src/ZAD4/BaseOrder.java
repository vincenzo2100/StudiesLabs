package ZAD4;

public abstract class BaseOrder {
    String description = "Unknown Order";


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
