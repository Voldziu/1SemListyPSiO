package Lista1;

public class Sort {
    public static void SortowanieBabelkowe(double array[]){
        int n=array.length;
        double tmp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j+1]<array[j]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
    public static void WypisanieWkolejnosci(double array[],int length){

        for(int i=0; i<length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {


        double[] array = new double[]{1.0,5.0,321.0,321312.0,-112.0,321312.0};
        int n = array.length;



        SortowanieBabelkowe(array);
        WypisanieWkolejnosci(array,n);
    }
}