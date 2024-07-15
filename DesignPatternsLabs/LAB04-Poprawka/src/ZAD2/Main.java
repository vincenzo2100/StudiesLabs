package ZAD2;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Company company1 = new Company("Apple",4000,stock);
        Company company2 = new Company("Google",5000,stock);
        Company company3 = new Company("Microsoft",3000,stock);
        Company company4 = new Company("Facebook",6000,stock);

        stock.setCompanyPrice("Google");
        stock.setCompanyPrice("Google");
        stock.setCompanyPrice("Apple");
        stock.setCompanyPrice("Apple");
        stock.setCompanyPrice("Apple");
        stock.setCompanyPrice("Microsoft");
        stock.setCompanyPrice("Facebook");




    }
}
