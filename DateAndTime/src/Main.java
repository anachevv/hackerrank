import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2015;

        String dayName = getDayName((new GregorianCalendar(year, month - 1, day)).getTime());
        System.out.println(dayName.toUpperCase());
    }
    public static String getDayName(Date d) {
        DateFormat f = new SimpleDateFormat("EEEE");
        try {
            return f.format(d);
        } catch(Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
