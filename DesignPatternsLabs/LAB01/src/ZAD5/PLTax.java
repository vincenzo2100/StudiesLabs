package ZAD5;

public class PLTax implements TaxCalculation{
    @Override
    public double CalculatePriceWithTax(double price) {
        return 1.23 * price;
    }
}
