package Lista1;

public class NWD {
    public static int NWD(int M, int N){
        M=Math.abs(M);
        N = Math.abs(N);
        int tmp;
        while (N!=0){
            tmp = N;
            N=M%N;
            M=tmp;


        }
        return M;
    }





    public static void main(String[] args) {

        int M,N;
        M = 6;
        N= -17;
        System.out.println(NWD(M,N));
    }
}
