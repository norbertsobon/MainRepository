public class PolaczenieZBazaMySQL {
    public void dodajUzytkownika(String imie, String haslo){
        Uzytkownik user = new Uzytkownik();
        user.polaczenie(imie, haslo);
    }

    public static void main(String[] args) {
        PolaczenieZBazaMySQL obiekt = new PolaczenieZBazaMySQL();
        Uzytkownik obiekt2 = new Uzytkownik();
//        obiekt.dodajUzytkownika("Kuba", "Zarychta");
//        obiekt.dodajUzytkownika("Igor", "Cwyl");
//        obiekt.dodajUzytkownika("Maksymilian", "Gembarzewski");
        System.out.println(obiekt2.polaczenieWynik("SELECT * FROM Uzytkownicy"));
    }

}
