package Week2.Examples.Java8Enhancement;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateExample {
	public static void main(String[] args) {

		LocalDate xmas2019 = LocalDate.of(2019, 12, 25);
		System.out.println(xmas2019.toString());

		LocalDate newYear2020 = xmas2019.plusDays(33);
		System.out.println(newYear2020.toString());
		
		Period period = Period.between(xmas2019, newYear2020);
		
		
		LocalDate localDate = LocalDate.now();
		// LocalDate localDate =  LocalDate.parse("2020-01-23");
		System.out.println(localDate.toString());
		System.out.println(localDate.getDayOfWeek().toString());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.plusDays(12).toString());
		System.out.println(period.getDays());
	}

}
