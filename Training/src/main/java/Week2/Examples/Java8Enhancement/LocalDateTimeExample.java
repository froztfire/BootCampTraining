package Week2.Examples.Java8Enhancement;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		
		//LocalDateTime localDateTime = LocalDateTime.now();
		//LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 23, 06, 30);
		LocalDateTime localDateTime = LocalDateTime.parse("2020-01-23T06:30:00");
		System.out.println(localDateTime.toString());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMinute());
		System.out.println(localDateTime.getSecond());
		System.out.println(localDateTime.getNano());
		System.out.println(localDateTime.plusDays(12).toString());
		System.out.println(localDateTime.minusHours(2).toString());
	}

}
