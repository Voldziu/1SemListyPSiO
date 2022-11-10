package Lista3;


import java.util.Random;

public class Tablica {
    private int dlugosc;
    private int[] tab;

    public Tablica(int dlugosc){
        this.dlugosc=dlugosc;
        this.tab = new int[dlugosc];
    }

    public int[] getTab() {
        return tab;
    }

    public void WypelnijLosowo(int k){
        Random rn = new Random();
        for (int i = 0; i <dlugosc ; i++) {
            tab[i]= rn.nextInt(k);
        }
    }
    public void WyprintujOdPoczatku(){
        for (int i = 0; i <dlugosc ; i++) {
            System.out.println(tab[i]);
        }
        
    }
    public void WyprintujOdTylu(){
        for (int i = dlugosc-1; i >=0 ; i--) {
            System.out.println(tab[i]);
        }
    }
    public int PoliczParzyste(){
        int parzyste=0;
        for (int i = 0; i <dlugosc ; i++) {
            if(tab[i]%2==0){
                parzyste++;
            }
        }return parzyste;
    }
    public int PoliczNieparzyste(){

        return dlugosc-PoliczParzyste();
    }
    public Tablica Parzyste(){
        int k=0;
        Tablica Even = new Tablica(PoliczParzyste());
        for (int i = 0; i <dlugosc ; i++) {
            if(tab[i]%2==0){
                Even.getTab()[k]=tab[i];
                k++;
            }

        }return  Even;
    }
    public Tablica Nieparzyste(){
        int j=0;
        Tablica Odd = new Tablica(PoliczNieparzyste());
        for (int i = 0; i <dlugosc ; i++) {
            if(tab[i]%2==1){
                Odd.getTab()[j]=tab[i];
                j++;
            }

        } return  Odd;
    }
    public int max(){
        int max=tab[0];
        for (int i = 0; i <dlugosc ; i++) {
            if(tab[i]>max){
                max = tab[i];
            }
        }return max;
    }
    public int min(){
        int min=tab[0];
        for (int i = 0; i <dlugosc; i++) {
            if(tab[i]<min){
                min = tab[i];
            }
        } return min;
    }


}


