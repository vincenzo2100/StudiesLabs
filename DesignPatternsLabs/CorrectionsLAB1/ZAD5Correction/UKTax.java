package ZAD5Correction;

public class UKTax implements TaxCalculation{
    @Override
    public double CalculatePriceWithTax(double price) {
        return 1.2 * price;
    }
}
