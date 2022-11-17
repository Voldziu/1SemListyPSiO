package Lista4;

public class Main {
    public static void main(String[] args) {
        SluzbistaMundurowy[] TabMundurowe = new SluzbistaMundurowy[6];
        TabMundurowe[0]= new Strazak(30,"Sierżant","Bartek","Kucharczyk",true,false);
        TabMundurowe[1] = new Policjant(51,"Podkomisarz","Włodzimierz","Biały",true,true);
        TabMundurowe[2]= new Strazak(52,"Komisarz","Marek","Zadymiarz",false,true);
        TabMundurowe[3]= new Policjant(21,"Aspirant","Tadeusz","Soplica",true,false);
        TabMundurowe[4]= new Strazak(70,"Generalny Inspektor","Georg","Hegel",false,false);
        TabMundurowe[5]= new Policjant(40,"Inspektor","Michał","Walaszek",false,true);

        for (int i = 0; i <TabMundurowe.length ; i++) {
            TabMundurowe[i].getStan();
        }
        ((Policjant)TabMundurowe[1]).NowyMundur("normalny","XL","granatowy",15);
        ((Policjant)TabMundurowe[1]).getMundurek().getStan();



    }
}
