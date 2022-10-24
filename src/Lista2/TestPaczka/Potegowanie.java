
package Lista2.TestPaczka;

public class Potegowanie {
    public static double Ptg(double x, int k) {

        double value = 1;

        for (int i = 1; i <= k; i++) {
            value = value * x;
        }


        return value;
    }

    public static long pow2(long a, long b) {
        long re = 1;
        while (b > 0) {
            if (b%2==1){
                re *= a;
            }
            b =b/2;
            a *= a;
        }
        return re;
    }
}