package BielenikCwiczenia.Hotel;

public class Osoba {
    private String Imie;
    private String Nazwisko;

    public Osoba(){
        Imie="Jan";
        Nazwisko="Szczupak";

    }
    public Osoba(String Imie,String Nazwisko){
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }
}
