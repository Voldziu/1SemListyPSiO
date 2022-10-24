package Lista2;
import Lista2.TestPaczka.*;



public class Zad4 {
    public static double E_x_mm(double x,int n){
        double sum = 0;
        for(int k=0;k<=n;k++){
            sum+= Potegowanie.Ptg(x,k)/Silnia.Sln(k);

        } return sum;
    }
    public static double Sin_x_mm(double x,int n){
       x = x%(2*Math.PI);
        double sum=0;
        int sgn =-1;
        for(int k=0;k<=n;k++){
            sgn =sgn*-1;
            sum+=sgn*Potegowanie.Ptg(x,(2*k+1))/Silnia.Sln((2*k+1));
        }
        return sum;
    }
    public static double Cos_x_mm(double x,int n){
        x = x%(2*Math.PI);
        double sum=0;
        int sgn =-1;
        for(int k=0;k<=n;k++){
            sgn =sgn*-1;
            sum+=sgn*Potegowanie.Ptg(x,(2*k))/Silnia.Sln((2*k));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(E_x_mm(2,50));
        System.out.println(Sin_x_mm(3.14,10));
        System.out.println(Cos_x_mm(3.14,10));
        System.out.println(Potegowanie.pow2(2,9));

    }
}