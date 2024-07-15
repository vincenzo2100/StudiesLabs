package ZAD2;

public class MAINZad2 {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Company company1 = new Company("Google",2000);
        Company company2 = new Company("Microsoft",3000);
        Company company3 = new Company("Apple",1000);
        stock.addObserver(company1);
        stock.addObserver(company2);
        stock.addObserver(company3);
        stock.setStockPrice(300);
        stock.removeObserver(company1);
        stock.setStockPrice(1000);
        stock.removeObserver(company2);
        stock.setStockPrice(50000);
        stock.removeObserver(company3);
        stock.setStockPrice(120);





    }
}
