package john_java8.datetime;

import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatExample {
    public static void main(String args[]) {
        DateTimeFormatExample.doDateTimeFormat();
        doDateTimeFormatter();
        doJodaTimeExample();

    }

    public static void doDateTimeFormat() {
        final DateFormat format = new SimpleDateFormat("hh:mm:ss a");
        final String formattedDate = format.format(new Date());
        System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);

    }

    public static void doDateTimeFormatter() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = now.format(formatter);
        System.out.println("text=" + text);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println("parsedDate=" + parsedDate.toString());
        //Date instance
        Date date = DateTime.now().toDate();
        System.out.println("before java 8 date:" + date.toString());

    }

    public static void doJodaTimeExample() {
        DateTime dt = new DateTime();
        String monthName = dt.monthOfYear().getAsText();
        String frenchShortName = dt.monthOfYear().getAsShortText(Locale.FRENCH);
        boolean isLeapYear = dt.year().isLeap();
        DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        System.out.println("monthName=" + monthName + ", frenchShortName=" + frenchShortName + ",isLeapYear=" + isLeapYear + ",rounded=" + rounded);
    }
}
