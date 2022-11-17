package Lista4;

public class Strazak extends SluzbistaMundurowy {
    private boolean czyDzielny;
    private boolean czySilny;
    private Mundur mundurek = null;


    public Strazak(int wiek,String ranga, String Imie, String nazwisko,  boolean czyDzielny, boolean czySilny) {
        super(wiek, ranga,Imie, nazwisko);
        this.czyDzielny = czyDzielny;
        this.czySilny = czySilny;
    }

    //                                      GETERY SETERY

    public boolean isCzyDzielny() {
        return czyDzielny;
    }

    public boolean isCzySilny() {
        return czySilny;
    }

    public void setCzyDzielny(boolean czyDzielny) {
        this.czyDzielny = czyDzielny;
    }

    public void setCzySilny(boolean czySilny) {
        this.czySilny = czySilny;
    }
    public void getStan(){
        System.out.println("STRAZAK");
        super.getStan();
        System.out.println("CzyDzielny: "+isCzyDzielny()+" Czy Silny: "+isCzySilny());
        System.out.println("-----------------------------------------");

    }
    public void NowyMundur(String kroj, String rozmiar, String kolor,int liczbaGuzikow ){
        mundurek = new Mundur(kroj,rozmiar,kolor,liczbaGuzikow);
    }

    public Mundur getMundurek() {
        return mundurek;
    }

    //              METODY
    public String WywazDrzwi(){
        if(czySilny) return "Udalo sie wyważyć";
        else return "Nie udało się wyważyć";
    }
    public String WskoczWOgien(){
        if(czyDzielny) return "Wskoczył w ogień";
        else return "Nie wskoczył w ogien ";
    }
    public void Awans(){
        KomendantGlowny.DajAwans(this);
    }
}

