package ZAD2;

public class Synthesizer implements AdDeliverStrategy{
    @Override
    public void deliverAd(String language) {
        System.out.println("Translating ad to " + language);
        System.out.println("Sending ad using speech synthesizer");
    }
}
