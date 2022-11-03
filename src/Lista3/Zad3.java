package Lista3;

import java.util.Random;

public class Zad3 {
    static int M=2;
    static int[][] Macierz1 =new int[M][M];
    static int[][] Macierz2 = new int[M][M];

    public static void WypelnijMacierz(int[][] M,int k){
        Random rn = new Random();
        for (int i = 0; i <M.length; i++) {
            for (int j = 0; j <M[i].length ; j++) {
                M[i][j]= rn.nextInt(k);
                System.out.println(M[i][j]);

            }
        }
    }
    public static void SumaMacierzy(int[][] M1,int[][] M2){
        int[][] Suma = new int[M][M];
        for (int i = 0; i <M1.length ; i++) {
            for (int j = 0; j <M1[i].length; j++) {
                Suma[i][j]=M1[i][j]+M2[i][j];
                System.out.println(Suma[i][j]);
            }
        }
    }
    public static void IloczynMacierzy(int[][] M1,int[][] M2){
        int suma;
        int[][] Iloczyn = new int[M][M];
        for (int i = 0; i <M1.length; i++) {
            for (int j = 0; j <M1.length ; j++) {
                suma=0;
                for (int k = 0; k <M1.length ; k++) {
                    suma+=M1[i][k]*M2[k][j];

                }
                Iloczyn[i][j]=suma;
                System.out.println(suma);
            }
        }
    }



    public static void main(String[] args){
        WypelnijMacierz(Macierz1,10);
        WypelnijMacierz(Macierz2,10);
        SumaMacierzy(Macierz1,Macierz2);
        IloczynMacierzy(Macierz1,Macierz2);
    }
}
