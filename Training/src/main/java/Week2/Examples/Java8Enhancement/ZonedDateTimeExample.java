package Week2.Examples.Java8Enhancement;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZonedDateTimeExample {
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		allZoneIds.forEach(System.out::println);
		
		// Leaving from San Francisco on Dec 20, 2019, at 7:30 p.m.
		LocalDateTime leaving = LocalDateTime.of(2019, Month.DECEMBER, 20, 19, 30);
		ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
		//ZonedDateTime departure = ZonedDateTime.parse("2019-12-20T19:30:00-08:00[America/Los_Angeles]");

		try {
			String out1 = departure.format(format);
			System.out.printf("LEAVING:  %s (%s)%n", out1, leavingZone);
		} catch (DateTimeException exc) {
			System.out.printf("%s can't be formatted!%n", departure);
			throw exc;
		}

		// Flight is 10 hours and 50 minutes, or 650 minutes
		ZoneId arrivingZone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusMinutes(650);

		try {
			String out2 = arrival.format(format);
			System.out.printf("ARRIVING: %s (%s)%n", out2, arrivingZone);
		} catch (DateTimeException exc) {
			System.out.printf("%s can't be formatted!%n", arrival);
			throw exc;
		}

		if (arrivingZone.getRules().isDaylightSavings(arrival.toInstant()))
			System.out.printf("  (%s daylight saving time will be in effect.)%n", arrivingZone);
		else
			System.out.printf("  (%s standard time will be in effect.)%n", arrivingZone);
	}

}
