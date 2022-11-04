package BielenikCwiczenia.Hotel;

public class Pokoj {
    private final int numer;
    private Osoba os =null;

    public int getNumer() {
        return numer;
    }
    public Pokoj(int numer){
        this.numer=numer;

    }

    public void ZapelnijPokoj(String Imie,String Nazwisko){
        os =new Osoba(Imie,Nazwisko);
    }

    public Osoba getOsoba(){
        return os;
    }
    public boolean CzyWolny(){
        return os == null;
    }
    public void ZwolnijPokoj(){
        os= null;
    }
    public boolean CzyZajetyPrzezX(String Imie, String Nazwisko){
        if (os !=null) {
            return (os.getImie().equals(Imie)) && (os.getNazwisko().equals(Nazwisko));
        } else{
            return false;
        }
    }




}
