package ZAD2;

public class UKReceiver implements AdReceiver{
    @Override
    public String GetPreferedLanguage() {
        return "English";
    }

    @Override
    public void SendAddToReceiver() {
        System.out.println("Sending ad to UK receiver");
    }
}
