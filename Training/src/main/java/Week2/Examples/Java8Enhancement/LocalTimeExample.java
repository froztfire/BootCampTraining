package Week2.Examples.Java8Enhancement;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
	
	public static void main(String[] args) {
	
		LocalTime localTime = LocalTime.of(12,20);
		//LocalTime localTime = LocalTime.of(12,20,15);
		//LocalTime localTime = LocalTime.of(12,20,15,30);
		//LocalTime localTime = LocalTime.now();
		//LocalTime localTime = LocalTime.parse("06:30");
		System.out.println(localTime.toString());
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		System.out.println(localTime.getNano());
		System.out.println(localTime.plus(1, ChronoUnit.HOURS).toString());
		System.out.println(localTime.MIDNIGHT);
		System.out.println(localTime.NOON);
	}

}
