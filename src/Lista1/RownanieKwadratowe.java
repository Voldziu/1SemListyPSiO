package Lista1;

public class RownanieKwadratowe {
    public static void liniowe(double b,double c ){
        double x;
        if (b==0){
            if (c==0){
                System.out.println("Nieskończenie wiele rozwiązań");

            } else {
                System.out.println("Równanie sprzeczne");
            }
        } else{
            x = -c/b;
            System.out.println("Równanie liniowe. x="+x);
        }


    }
    public static double PoliczDelte(double a, double b, double c){
        double delta;
        delta = b*b-4*a*c;
        return delta;


    }
    public static void main(String[] args){
//        System.out.println("Wpisz a,b,c: \n" +
//                "a,b,c");
//        Scanner in = new Scanner(System.in);
        double a,b,c,x1,x2;
//        a=in.nextDouble();
//        b=in.nextDouble();
//        c=in.nextDouble();

        a=1;
        b=2;
        c=1;


        if(a==0){
            liniowe(b,c);
        }else{
            double delta = PoliczDelte(a,b,c);
            if (delta<0){
                System.out.println("Brak Odpowiedzi");
            } else{
                if(delta==0) {
                    x1=-b/(2*a);
                    System.out.println("Jedno rozwiązanie: "+x1);


                } else{
                    x1 = (-b +Math.sqrt(delta))/(2*a);
                    x2 = (-b -Math.sqrt(delta))/(2*a);
                    System.out.println("Dwa rozwiązania: "+x1 +" oraz " +x2);

                }

            }


        }
    }
}