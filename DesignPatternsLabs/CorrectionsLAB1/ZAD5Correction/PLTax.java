package ZAD5Correction;

public class PLTax implements TaxCalculation{
    @Override
    public double CalculatePriceWithTax(double price) {
        return 1.23 * price;
    }
}
