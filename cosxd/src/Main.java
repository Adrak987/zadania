import inneKlasy.Daty;
import inneKlasy.Kwiaciarnia;
import inneKlasy.Sklep;
import java.time.format.DateTimeFormatter;
import java.awt.desktop.SystemSleepEvent;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        Sklep sklep = new Sklep("Limanowskiego 32/54",20, true, 2000);
        int miesiace = 9;
        System.out.println(sklep.toString());
        System.out.println("W sklepie zmieści się tyle półek: " + sklep.ilePolek());
        System.out.println("Wysokość czynszu dla " + miesiace +" miesięcy: " + sklep.wysokoscCzynszu(miesiace));
        System.out.println("");
        System.out.println("Zadanie 2");
        Kwiaciarnia kwiaciarnia = new Kwiaciarnia("Limanowskiego 32/54", 70, false, 3000,10);
        System.out.println(kwiaciarnia.toString());
        System.out.println("W kwiaciarni zmieści się tyle półek: " + kwiaciarnia.ilePolek());
        System.out.println("");
        System.out.println("Zadanie 3");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        String date = "05-01-2020";
        int dni = 20;
        int miesiace2 = 2;
        String data1 = "05-02-2020";
        String data2 = "05-08-2020";
        LocalDate data = LocalDate.parse(date, formatter);
        LocalDate data11 = LocalDate.parse(data1, formatter);
        LocalDate data21 = LocalDate.parse(data2, formatter);
        System.out.println("Różnica miesięcy od podanych dat: " + Daty.roznicaMiesiace(data11, data21));

        System.out.println("Dodając do podanejdaty " + dni + " dni otrzymujemy datę: " + Daty.Interwal(data, dni));
    }
}