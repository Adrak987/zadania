package inneKlasy;

public class Kwiaciarnia extends Sklep {
    public static int PowierzchniaZaplecza;

    public Kwiaciarnia(String adresSklepu, int powierzchniaLokalu, boolean czyJestWc, int czynszNajmu, int powierzchniaZaplecza) {
        super(adresSklepu, powierzchniaLokalu, czyJestWc, czynszNajmu);
        this.PowierzchniaZaplecza = powierzchniaZaplecza;
    }

    @Override
    public String toString() {
        int powierzchnia = PowierzchniaZaplecza + PowierzchniaLokalu;
        if(CzyJestWc)
        {
            return "Adres sklepu: " + AdresSklepu + "\nPowierzchnia kwiaciarni: " + powierzchnia + "m2\nLokal posiada WC \nCzynsz najmu: " + CzynszNajmu;
        }
        else
        {
            return "Adres sklepu: " + AdresSklepu + "\nPowierzchnia kwiaciarni: " + powierzchnia + "m2\nLokal nie posiada WC \nCzynsz najmu: " + CzynszNajmu;
        }
    }

    @Override
    public int ilePolek() {
        return (PowierzchniaLokalu + PowierzchniaZaplecza) / 4;
    }
}
