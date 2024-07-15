package ZAD3;

import java.util.ArrayList;

public abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription() {
        return description ;
    }

    public abstract double cost();


}
