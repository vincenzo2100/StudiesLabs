package ZAD5Correction;

import java.util.ArrayList;

public class MainZAD5 {
    public static void main(String[] args) {
        Shop x = new Shop("Cleaning",200,new PLTax());
        x.performTaxCalculation();
        System.out.printf("%s %f %n",x.serviceName,x.servicePriceWithTax);
        x.setTaxCalculation(new GBTax());
        x.performTaxCalculation();
        System.out.printf("%s %f %n",x.serviceName,x.servicePriceWithTax);
        x.setTaxCalculation(new UKTax());
        x.performTaxCalculation();
        System.out.printf("%s %f %n",x.serviceName,x.servicePriceWithTax);

    }
}
