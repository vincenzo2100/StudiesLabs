package ZAD2;

public class SMS implements AdDeliverStrategy{
    @Override
    public void deliverAd(String language) {
        System.out.println("Translating ad to " + language);
        System.out.println("Sending ad using SMS");
    }
}
