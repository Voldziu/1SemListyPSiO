package Lista4;



public class KomendantGlowny {

        public static void DajAwans(SluzbistaMundurowy sm){
            String[] tablicaRang = new String[]{"Młodszy Aspirant","Aspirant","Sierżant","Podkomisarz","Komisarz","Nadkomisarz","Inspektor","Generalny Inspektor"};
            String obecne;
            obecne = sm.getRanga();
            int index=-1;
            int i=0;
            while((i< tablicaRang.length)&&(i!=index)){
                if(tablicaRang[i]==obecne){
                    index=i;
                }
                i++;
            }
            if(index== tablicaRang.length-1){
                System.out.println("Ranga jest maksymalna");
            } else{
                sm.setRanga(tablicaRang[index+1]);
            }

        }





}
