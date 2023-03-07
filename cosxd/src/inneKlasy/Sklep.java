package inneKlasy;

public class Sklep {
    public static String AdresSklepu;
    public static int PowierzchniaLokalu;
    public static boolean CzyJestWc;
    public static int CzynszNajmu;
    public Sklep(String adresSklepu, int powierzchniaLokalu, boolean czyJestWc, int czynszNajmu)
    {
        this.AdresSklepu = adresSklepu;
        this.PowierzchniaLokalu = powierzchniaLokalu;
        this.CzyJestWc = czyJestWc;
        this.CzynszNajmu = czynszNajmu;
    }

    @Override
    public String toString() {
        if(CzyJestWc)
        {
            return "Adres sklepu: " + AdresSklepu + "\nPowierzchnia lokalu: " + PowierzchniaLokalu + "m2\nLokal posiada WC \nCzynsz najmu: " + CzynszNajmu;
        }
        else
        {
            return "Adres sklepu: " + AdresSklepu + "\nPowierzchnia lokalu: " + PowierzchniaLokalu + "m2\nLokal nie posiada WC \nCzynsz najmu: " + CzynszNajmu;
        }
    }

    public int ilePolek() {
        return PowierzchniaLokalu / 2;
    }

    public final int wysokoscCzynszu(int ileMiesiecy) {
        return CzynszNajmu * ileMiesiecy;
    }
}
