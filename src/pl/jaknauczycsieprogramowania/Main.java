package pl.jaknauczycsieprogramowania;

public class Main {

    public static void main(String[] args) {

        Uzytkownik mariusz = new Uzytkownik(20, "Mariusz");

        if (mariusz.czyMozeLegalnieKupicAlhohol()) {
            System.out.println("Moze kupic");
        } else {
            System.out.println("Nie moze kupic");
        }
    }
}
