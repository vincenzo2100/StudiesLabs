package ZAD2;

public class Company implements Observer {
    private String name;
    private double price;

    public Company(String name, double price) {
        this.name = name;
        this.price = price;
    }



    @Override
    public void update(double companyPrice) {
        System.out.println(name + " has been updated to price: $"+ companyPrice);
    }
}
