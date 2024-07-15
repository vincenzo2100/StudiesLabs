package ZAD6;

public class Pracownik {
    String zawod;
    Pracowac pracowac;
    Dojezdzac dojezdzac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;

    public Pracownik(String zawod, Pracowac pracowac, Dojezdzac dojezdzac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu) {
        this.zawod = zawod;
        this.pracowac = pracowac;
        this.dojezdzac = dojezdzac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }

    public void Pracuj(){pracowac.pracuj();}
    public void SpedzajWolnyCzas(){spedzanieWolnegoCzasu.spedzajWolnyCzas();}
    public void Dojezdzaj(){dojezdzac.dojezdzaj();}
}
