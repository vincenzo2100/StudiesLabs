package ZAD2;

public class AdAgency {
   String sender;
   Ad ad;
   AdDeliverStrategy adDeliverStrategy;
   AdReceiver adReceiver;


    public AdAgency(String sender, Ad ad, AdDeliverStrategy adDeliverStrategy, AdReceiver adReceiver) {
        this.sender = sender;
        this.ad = ad;
        this.adDeliverStrategy = adDeliverStrategy;
        this.adReceiver = adReceiver;

    }

    public void SendingAd(){
        adDeliverStrategy.deliverAd(adReceiver.GetPreferedLanguage());
        adReceiver.SendAddToReceiver();
        ad.AdContent();
    }

    public void setAdDeliverStrategy(AdDeliverStrategy adDeliverStrategy) {
        this.adDeliverStrategy = adDeliverStrategy;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    public void setAdReceiver(AdReceiver adReceiver) {
        this.adReceiver = adReceiver;
    }
}
