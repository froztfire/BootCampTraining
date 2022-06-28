package Week2.Examples.Java8Enhancement;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		System.out.println(instant.toString());
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString());
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString());
		System.out.println(instant.minusSeconds(10).toString());
		
	}

}
