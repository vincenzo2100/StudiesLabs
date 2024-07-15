package ZAD5;

public class GBTax implements TaxCalculation{

    @Override
    public double CalculatePriceWithTax(double price) {
        return 1.19 * price;
    }
}
