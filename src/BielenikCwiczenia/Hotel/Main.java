package BielenikCwiczenia.Hotel;

public class Main {
    public static void main(String[] args){
        Hotel hotel = new Hotel(10);
        hotel.getTab()[1].ZapelnijPokoj("Marian","Pazdzioch");
        System.out.println(hotel.getTab()[1].getOsoba().getImie());
        hotel.getTab()[1].ZwolnijPokoj();
        System.out.println(hotel.getTab()[1].CzyWolny());
        hotel.getTab()[2].ZapelnijPokoj("Marian","Pazdzioch");
        hotel.getTab()[3].ZapelnijPokoj("Marian","Pazdzioch");
        hotel.getTab()[4].ZapelnijPokoj("Marian","Pazdzioch");
        hotel.getTab()[5].ZapelnijPokoj("Marian","Pazdzioch");
        hotel.WypiszStanPokoi();
//        System.out.println(hotel.CzyWolnyJakis());
//        System.out.println(hotel.IleWolnych());
//        hotel.WyjebWszystkie("Marian","Pazdzioch");
//        hotel.WypiszStanPokoi();
//        System.out.println(hotel.CzyWolnyJakis());
//        System.out.println(hotel.IleWolnych());
        System.out.println(hotel.getTab()[2].CzyZajetyPrzezX("Marian","Pazdzioch"));


    }
}
