package Lista3;

import java.util.Arrays;
import java.util.Random;

public class Macierz {
    private int M;
    private int[][] maciek;
    public Macierz(int M){
        this.M = M;
        this.maciek = new int[M][M];
    }


    public void Wypelnij(int k){
        Random rn = new Random();
        for (int i = 0; i <M; i++) {
            for (int j = 0; j <M; j++) {
                maciek[i][j]= rn.nextInt(k);
            }
        }
    }

    public int[][] getMaciek() {
        return maciek;
    }

    public Macierz suma(Macierz M2){
        Macierz suma = new Macierz(M);
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j <M ; j++) {
                suma.getMaciek()[i][j]=maciek[i][j]+M2.getMaciek()[i][j];
            }
        } return suma;


    }
    public Macierz iloczyn(Macierz M2){
        Macierz iloczyn = new Macierz(M);
        int suma;
        for (int i = 0; i <M; i++) {
            for (int j = 0; j <M; j++) {
                suma=0;
                for (int k = 0; k <M; k++) {
                    suma += maciek[i][k]*M2.getMaciek()[k][j];
                }
                iloczyn.getMaciek()[i][j]=suma;
            }
        }
        return iloczyn;
    }
    public void Wypisz(){
        for (int i = 0; i <M ; i++) {
            System.out.println(Arrays.toString(maciek[i]));
        }
    }
}
