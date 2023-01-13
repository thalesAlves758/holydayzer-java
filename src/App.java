import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        HolidaysCalendar calendar = new HolidaysCalendar();

        calendar.printHolidayName("25/12/2023");
        calendar.printHolidayName("26/12/2023");

        List<Holiday> holidays = calendar.getHolidays();
    }
}
