package Lista3;

public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica(10);
        tablica.WypelnijLosowo(100);
        tablica.WyprintujOdPoczatku();
        System.out.println();
        tablica.WyprintujOdTylu();
        System.out.println();
        tablica.PoliczParzyste();
        tablica.PoliczNieparzyste();
        tablica.Parzyste().WyprintujOdPoczatku();
        System.out.println();
        tablica.Nieparzyste().WyprintujOdPoczatku();
        System.out.println("Max: "+ tablica.max());
        System.out.println("Min: "+ tablica.min());
        Macierz m1 = new Macierz(2);
        Macierz m2 = new Macierz(2);
        m1.Wypelnij(10);
        m2.Wypelnij(10);
        m1.Wypisz();
        System.out.println();
        m2.Wypisz();
        System.out.println();
        m1.suma(m2).Wypisz();
        System.out.println();
        m1.iloczyn(m2).Wypisz();


    }
}
