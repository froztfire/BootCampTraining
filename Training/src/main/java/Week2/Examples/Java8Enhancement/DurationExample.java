package Week2.Examples.Java8Enhancement;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationExample {
	public static void main(String[] args) {

		Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d.get(ChronoUnit.SECONDS));
		
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		Duration diff = Duration.between(initialTime, finalTime);
		System.out.println(initialTime);
		System.out.println(finalTime);
		System.out.println(diff);	//ISO_8601 format
		System.out.println(diff.get(ChronoUnit.SECONDS));
	}

}
