import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class NewDateClass {
    public static void main(String args[])
    {
        DateTimeFormatter ftf=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate ldt=LocalDate.now();
        System.out.println(ldt.get(ChronoField.DAY_OF_YEAR));
    }
}
