package ZAD2;

public class Company implements Observer{
    private  Stock stock;
    private  String companyName;
    private double companyPrice;

    public Company(String companyName,double companyPrice,Stock stock) {
        this.companyName = companyName;
        this.companyPrice = companyPrice;
        this.stock = stock;
        stock.registerObserver(this);
    }

    @Override
    public void update(String companyName, double companyPrice) {
        if(companyName.equals(this.companyName))
        {
            this.companyPrice = companyPrice;
            System.out.println(this.companyName + " nowa cena: " + this.companyPrice);
        }
    }


}
