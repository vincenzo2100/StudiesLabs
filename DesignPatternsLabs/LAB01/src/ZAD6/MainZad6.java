package ZAD6;

import ZAD4.Duck;

import java.util.ArrayList;

public class MainZad6 {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();

        pracownicy.add(new Pracownik("Mechanik",new NaprawaSamochodow(),new Samochod(),new LiteraturaPopularnoNaukowa()));
        pracownicy.add(new Pracownik("Doktor",new Leczenie(),new Rower(),new Silownia()));
        pracownicy.add(new Pracownik("Listonosz",new RoznoszenieListow(),new Rower(),new LiteraturaPopularnoNaukowa()));

        for(Pracownik a:pracownicy)
        {
            a.Pracuj();
            a.Dojezdzaj();
            a.SpedzajWolnyCzas();
        }
    }
}
