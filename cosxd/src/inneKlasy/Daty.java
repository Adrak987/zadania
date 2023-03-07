package inneKlasy;
import java.time.Month;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Daty {
    private static final String DATE_FORMATTER= "dd.MM.yyyy";
    public static int roznicaMiesiace(LocalDate Data1, LocalDate Data2) {
        Period age = Period.between(Data1, Data2);
        return age.getMonths();
    }

    public static String Interwal(LocalDate Data , int Dni) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        LocalDate cos = Data.plusDays(Dni);
        String data = cos.format(formatter);
        return data;
    }
}
