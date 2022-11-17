package Lista4;

import java.util.Random;

public class Policjant extends SluzbistaMundurowy{
    private boolean czyAgresywny;
    private boolean czyZadyszka;
    private Mundur mundurek = null;

    public Policjant(int wiek, String ranga, String Imie, String nazwisko, boolean czyAgresywny, boolean czyZadyszka){
        super(wiek,ranga,Imie,nazwisko);
        this.czyAgresywny = czyAgresywny;
        this.czyZadyszka = czyZadyszka;


    }
    //GETERY SETERY


    public boolean isCzyAgresywny() {
        return czyAgresywny;
    }

    public boolean isCzyZadyszka() {
        return czyZadyszka;
    }

    public void setCzyAgresywny(boolean czyAgresywny) {
        this.czyAgresywny = czyAgresywny;
    }

    public void setCzyZadyszka(boolean czyZadyszka) {
        this.czyZadyszka = czyZadyszka;
    }

    //                      CZESC MUNDUROWA

    public void NowyMundur(String kroj, String rozmiar, String kolor,int liczbaGuzikow ){
        mundurek = new Mundur(kroj,rozmiar,kolor,liczbaGuzikow);
    }

    public Mundur getMundurek() {
        return mundurek;
    }

    @Override
    public void getStan() {
        System.out.println("POLICJANT");
        super.getStan();
        System.out.println("Agresywny: "+isCzyAgresywny()+" Czy łapie zadyszkę? "+isCzyZadyszka());
        System.out.println("__________________________________________________");
    }

    //              METODY

    public String ZlapZlodzieja(){
        if(czyZadyszka) return "Nie udało się złapać złodzieja";
        else return "Udało się złapać gnojka";
    }
    public String ZakujWKajdanki(){
        if(czyAgresywny){
            return "Agresywne i ciasne zakuwanie kajdanek";
        } else{
            return "Luźne i łagodne zakuwanie kajdanek";
        }
    }
    public String ZaatakujObywatela(){
        Random rn = new Random();
        if((czyAgresywny)&&(rn.nextInt(6)==1)){
            return "Uderzenie";
        } else {
            return "Brak Uderzenia";
        }
    }
    public void Awans(){
        KomendantGlowny.DajAwans(this);
    }






}
