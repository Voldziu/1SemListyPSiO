package Lista2;
public class Zad3 {
    public static double E_x_mm(double x, int n){
        double nominator, denominator,sum;
        nominator=1;
        denominator=1;
        sum=1;




        for(int k=1;k<=n;k++){
            nominator =nominator*x;
            denominator=denominator*k;

            sum+=nominator/denominator;
        }
        return sum;
    }
    public static double Sin_x_mm(double x, int n){
        x=x%(2*Math.PI);
        double nominator, denominator,sum,fraction;
        int sgn =1;
        nominator=x;
        denominator=1;
        sum=x;




        for(int k=1;k<=n;k++){
            sgn =sgn*-1;
            nominator =nominator*x*x;
            denominator=denominator*2*k*(2*k+1);
            fraction =sgn*nominator/denominator;
            sum+=fraction;
        }
        return sum;
    }
    public static double Cos_x_mm(double x, int n){
        x=x%(2*Math.PI);
        double nominator, denominator,sum,fraction;
        int sgn=1;
        nominator=1;
        denominator=1;
        sum=1;




        for(int k=1;k<=n;k++){
            sgn = sgn*-1;
            nominator =nominator*x*x;
            denominator=denominator*2*k*(2*k-1);
            fraction =sgn*nominator/denominator;
            sum+=fraction;
        }
        return sum;
    }






    public static void main(String[] args) {
        System.out.println(E_x_mm(3,100));
        System.out.println(Sin_x_mm(3.14,100));
        System.out.println((Cos_x_mm(3.14,100)));
    }
}