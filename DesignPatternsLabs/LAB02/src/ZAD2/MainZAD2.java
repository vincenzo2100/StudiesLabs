package ZAD2;


import java.util.Random;

public class MainZAD2 {
    public static void main(String[] args) {
        /*
        Realizacja losowości ale nie byłem piewien czy o to chodziło
        Ad[] ads = {new AdContentFood(),new AdContentMedicine(),new AdContentShoes()};
        AdReceiver[] receivers = {new GBReceiver(),new PLReceiver(),new UKReceiver()};
        Random random = new Random();
        int randomAd = random.nextInt(ads.length);
        int randomReceiver = random.nextInt(receivers.length);
        AdAgency sender1 = new AdAgency("POLOX",ads[randomAd],new SMS(),receivers[randomReceiver]);
        sender1.SendingAd();
        sender1.setAdDeliverStrategy(new Synthesizer());
        sender1.SendingAd();
        sender1.setAdDeliverStrategy(new Email());
        sender1.SendingAd();
        */

        AdAgency sender1 = new AdAgency("POLOX",new AdContentShoes(),new SMS(),new UKReceiver());
        sender1.SendingAd();
        System.out.printf("%n");
        sender1.setAdDeliverStrategy(new Email());
        sender1.SendingAd();
        System.out.printf("%n");
        sender1.setAd(new AdContentMedicine());
        sender1.SendingAd();
        System.out.printf("%n");
        sender1.setAdReceiver(new PLReceiver());
        sender1.SendingAd();
        System.out.printf("%n");



    }
}
