package Lista2.TestPaczka;

public class Silnia {
    public static double Sln(int x) {


        long silnia = 1;
        for(long i=x;i>=1;i--){
            silnia = silnia*i;
        }

        return silnia;
    }
}