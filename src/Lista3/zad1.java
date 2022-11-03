package Lista3;

import java.util.Random;
import java.util.RandomAccess;
import java.util.random.RandomGenerator;


public class zad1 {
    static int n=10;
    static int[] TabInt = new int[n];
    public static void WypelnijTablice(int[] T,int k){
        Random random = new Random();

        for (int i = 0; i <T.length ; i++) {
            T[i]= random.nextInt(k);

        }

    }
    public static void WypiszKolejnosc(int[] T){
        for (int i = 0; i < T.length; i++) {
            System.out.println(T[i]);

        }
        System.out.println("--------------------------------");


    }
    public static void WypiszOdwrotnaKolejnosc(int[] T){
        for (int i = T.length-1; i >=0 ; i--) {
            System.out.println(T[i]);


        }
        System.out.println("--------------------------------");
    }
    public static void OddEven(int[] T){
        int[] Odd = new int[n];
        int[] Even = new int[n];
        int j=0;
        int k=0;
        for (int i = 0; i <T.length ; i++) {
            if(T[i]%2==0){
                Even[j]=T[i];
                j++;
            } else{
                Odd[k]=T[i];
                k++;
            }
        }
        for (int i = 0; i <Odd.length ; i++) {
            System.out.println(Odd[i]);

        }
        System.out.println("---------------");
        for (int i = 0; i <Even.length ; i++) {
            System.out.println(Even[i]);

        }
        System.out.println("---------------");
    }
    public static void max(int[] T){
        int max=T[0];
        for (int i = 0; i <T.length; i++) {
            if(T[i]>max){
                max =T[i];
            }

        }
        System.out.println("Max: "+max);
    }
    public static void min(int[] T){
        int min=T[0];
        for (int i = 0; i <T.length; i++) {
            if(T[i]<min){
                min =T[i];
            }

        }
        System.out.println("Min: "+min);
    }
    public static void main(String[] args){
        WypelnijTablice(TabInt,1000);
        WypiszKolejnosc(TabInt);
        WypiszOdwrotnaKolejnosc(TabInt);
        OddEven(TabInt);
        max(TabInt);
        min(TabInt);

    }
}
