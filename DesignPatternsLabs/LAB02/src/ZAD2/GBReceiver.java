package ZAD2;

public class GBReceiver implements AdReceiver{
    @Override
    public String GetPreferedLanguage() {
        return "German";
    }

    @Override
    public void SendAddToReceiver() {
        System.out.println("Sending ad to GB receiver");
    }
}
