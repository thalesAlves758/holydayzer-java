import java.util.ArrayList;
import java.util.List;

public class HolidaysCalendar {
  private List<Holiday> holidays;

  public HolidaysCalendar() {
    if (this.holidays == null || this.holidays.isEmpty()) {
      this.holidays = new ArrayList<Holiday>();

      this.holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
      this.holidays.add(new Holiday("21/02/2023", "Carnaval"));
      this.holidays.add(new Holiday("17/04/2023", "Páscoa"));
      this.holidays.add(new Holiday("21/04/2023", "Tiradentes"));
      this.holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
      this.holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
      this.holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
      this.holidays.add(new Holiday("02/11/2023", "Finados"));
      this.holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
      this.holidays.add(new Holiday("25/12/2023", "Natal"));
    }
  }

  public void printHolidayName(String date) {
    for (Holiday holiday : this.holidays) {
      if (holiday.getDate().equals(date)) {
        System.out.println(holiday.getName());
        return;
      }
    }

    System.out.println("Não existe um feriado com essa data!");
  }

  public List<Holiday> getHolidays() {
    return this.holidays;
  }
}
