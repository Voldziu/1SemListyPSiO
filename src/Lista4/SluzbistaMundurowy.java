package Lista4;

public abstract class SluzbistaMundurowy {
    private int wiek;
    private String ranga;
    private String Imie;
    private  String nazwisko;

    public  SluzbistaMundurowy(int wiek, String ranga, String Imie, String nazwisko){
        this.wiek = wiek;
        this.ranga = ranga;
        this.Imie = Imie;
        this.nazwisko = nazwisko;

    }
    //GETERY SETERY


    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getRanga() {
        return ranga;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setRanga(String ranga) {
        this.ranga = ranga;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void getStan(){
        System.out.println("Ranga: "+getRanga()+" Imię: "+getImie()+ " Nazwisko: "+ getNazwisko()+" Wiek: "+getWiek());
    }


}
