package BielenikCwiczenia.Hotel;

public class Hotel {
    private final int k;
    private Pokoj[] tab =null;
    public Hotel(int k){
        this.k=k;
        this.tab=new Pokoj[k];
        for (int i = 0; i <k; i++) {
            Pokoj pokoj = new Pokoj(100+i);
            tab[i]=pokoj;
        }
    }
    public void WyjebWszystkie(String Imie, String Nazwisko){
        for (int i = 0; i <k; i++) {
            if(tab[i].getOsoba()!=null){
                if((this.tab[i].getOsoba().getImie().equals(Imie))&& (this.tab[i].getOsoba().getNazwisko().equals(Nazwisko))) {
                    this.tab[i].ZwolnijPokoj();
                }
            }
        }
    }

    public Pokoj[] getTab() {
        return tab;
    }

    public void WypiszStanPokoi(){
        for (int i = 0; i <k ; i++) {
            if(tab[i].getOsoba()!=null) {
                System.out.println(tab[i].getNumer() + " " + tab[i].getOsoba().getImie() + " " + tab[i].getOsoba().getNazwisko());
            }else{
                System.out.println((tab[i].getNumer()+" Wolne"));
            }
        }
    }
    public boolean CzyWolnyJakis(){
        for (int i = 0; i <k ; i++)
            if (tab[i].getOsoba() == (null)) {
                return true;
            }
        return false;
    }
    public int IleWolnych(){
        int licznik=k;
        for (int i = 0; i <k ; i++) {
            if (tab[i].getOsoba()!=null){
                licznik--;
            }
        }
        return licznik;
    }

}

