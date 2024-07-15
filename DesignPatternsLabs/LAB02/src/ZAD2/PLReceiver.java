package ZAD2;

public class PLReceiver implements AdReceiver{
    @Override
    public String GetPreferedLanguage() {
        return "Polish";
    }

    @Override
    public void SendAddToReceiver() {
        System.out.println("Sending ad to Polish receiver");
    }
}
