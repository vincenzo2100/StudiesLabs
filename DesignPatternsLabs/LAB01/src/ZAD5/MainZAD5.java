package ZAD5;

import java.util.ArrayList;

public class MainZAD5 {
    public static void main(String[] args) {
        ArrayList<Shop> prices = new ArrayList<>();

        prices.add(new Shop("Cleaning PL",200,new PLTax()));
        prices.add(new Shop("Cleaning GB",200,new GBTax()));
        prices.add(new Shop("Cleaning UK",200,new UKTax()));
        for(Shop a:prices)
        {
            System.out.printf("Base %s service price without tax: %f %n",a.serviceName,a.serviceBasePrice);
        }

        for(Shop a:prices)
        {
            a.performTaxCalculation();
            System.out.printf("Base %s service price with tax: %f %n",a.serviceName,a.servicePriceWithTax);
        }


    }
}
