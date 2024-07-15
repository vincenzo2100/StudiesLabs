package ZAD5;

public class Shop {

    public  String serviceName;
    public double serviceBasePrice;
    public double servicePriceWithTax;
    public TaxCalculation taxCalculation;


    public Shop(String serviceName, double serviceBasePrice, TaxCalculation taxCalculation) {
        this.serviceName = serviceName;
        this.serviceBasePrice = serviceBasePrice;
        this.taxCalculation = taxCalculation;
    }

    public void performTaxCalculation(){
        this.servicePriceWithTax = taxCalculation.CalculatePriceWithTax(this.serviceBasePrice);
    }
}
