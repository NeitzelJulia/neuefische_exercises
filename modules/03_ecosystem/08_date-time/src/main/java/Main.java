import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));

        LocalDate today = LocalDate.now();
        LocalDate inTwoWeeks = today.plusWeeks(2);
        System.out.println(inTwoWeeks.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        LocalDate futureDate = LocalDate.of(2025, Month.AUGUST, 1);
        if (futureDate.isBefore(today)) {
            System.out.println("Das Datum liegt in der Vergangenheit");
        } else if (futureDate.isAfter(today)) {
            System.out.println("Das Datum liegt in der Zukunft");
        } else  {
            System.out.println("Das Datum ist heute");
        }

        LocalDate d1 = LocalDate.of(2024, Month.DECEMBER, 24);
        LocalDate d2 = LocalDate.of(2025, Month.JANUARY, 1);
        long daysBetween = ChronoUnit.DAYS.between(d1, d2);
        System.out.println(daysBetween);

        Animal tobi = new Animal("Tobi", LocalDate.of(2023, 3, 13));

        long days = tobi.daysUntilNextBirthday();
        System.out.printf("Es sind noch %d Tage bis zum nächsten Geburtstag von %s.",
                days, tobi.getName());
    }
}
