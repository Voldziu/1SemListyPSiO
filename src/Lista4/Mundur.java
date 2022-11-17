package Lista4;

public class Mundur {
    private String kroj;
    private String rozmiar;
    private String kolor;
    private int liczbaGuzikow;

    public Mundur(String kroj, String rozmiar, String kolor, int liczbaGuzikow) {
        this.kolor = kolor;
        this.kroj = kroj;
        this.rozmiar = rozmiar;
        this.liczbaGuzikow = liczbaGuzikow;
    }

    // GETERY SETERY


    public String getKolor() {
        return kolor;
    }

    public String getKroj() {
        return kroj;
    }

    public int getLiczbaGuzikow() {
        return liczbaGuzikow;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        this.rozmiar = rozmiar;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setKroj(String kroj) {
        this.kroj = kroj;
    }

    public void setLiczbaGuzikow(int liczbaGuzikow) {
        this.liczbaGuzikow = liczbaGuzikow;
    }
    public void getStan(){
        System.out.println("Mundur ma następujące właściwości:");
        System.out.println("Rozmiar: "+getRozmiar()+" Kolor: "+getKolor()+" Krój: "+getKroj()+"Liczba Guzików: "+getLiczbaGuzikow());
    }

    // METODY
}
