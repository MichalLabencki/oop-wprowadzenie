package pl.jaknauczycsieprogramowania;

public class Uzytkownik {

    private int wiek;
    private String imie;

    public Uzytkownik(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public boolean czyMozeLegalnieKupicAlhohol() {
        if(wiek >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int getWiek() {
        return wiek;
    }
}
