package Week2.Examples.Java8Enhancement;

import java.util.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateConversionExample {
	public static void main(String[] args) {
		
		// Instant and Date
		Date date1 = Date.from(Instant.now()); 			//new -> old
		Instant instant1 = date1.toInstant(); 			//old -> new
		LocalDate localDate = instant1.atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDateTime localDateTime = instant1.atZone(ZoneId.systemDefault()).toLocalDateTime();
		ZonedDateTime zonedDateTime = instant1.atZone(ZoneId.systemDefault());
		System.out.println("Instant = " + instant1);
		System.out.println("LocalDate = " + localDate);
		System.out.println("LocalDateTime = " + localDateTime);
		System.out.println("ZonedDateTime = " + zonedDateTime);
		
		
		// Instant and Timestamp
		Timestamp time = Timestamp.from(Instant.now()); //new -> old
		Instant instant2 = time.toInstant(); 			//old -> new
		System.out.println(instant2);
	}

}
