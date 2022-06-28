package Week2.Examples.Java8Enhancement;

import java.time.*;
import java.time.temporal.Temporal;

public class PeriodExample {
	public static void main(String[] args) {
		
		Period period = Period.ofDays(24);
		System.out.println(period.toString());
		
		period = Period.ofMonths(6);
		System.out.println(period.toString());
		
		period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
		System.out.println(period.toString());
		
		Temporal temp = period.addTo(LocalDate.now());
		System.out.println(temp);
	}
}