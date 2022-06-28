package Week2.Examples.Java8Enhancement;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class OffsetDateTimeExample {
	public static void main(String[] args) {
		// Find the last Thursday in December 2019 
		LocalDateTime localDateTime = LocalDateTime.of(2019, Month.DECEMBER, 20, 19, 30);
		System.out.println(localDateTime);
		
		ZoneOffset offset = ZoneOffset.of("-08:00");
		OffsetDateTime offsetDate = OffsetDateTime.of(localDateTime, offset);
		
		System.out.println(offsetDate);
		
		OffsetDateTime lastThursday =
		        offsetDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		System.out.printf("The last Thursday in December 2019 is the %sth.%n",
		                   lastThursday.getDayOfMonth());
	}

}
