package Week2.Examples.Java8Enhancement;

import java.util.*;

public class OldDateAPIExample {
	public static void main(String[] args) {
		Date date = new Date();

		Calendar cal = Calendar.getInstance();
		cal.set(2019, 11, 25);
		Date xmas2019 = cal.getTime();
		System.out.println(xmas2019);

		cal.add(Calendar.DAY_OF_MONTH, 7);
		Date newYear2020 = cal.getTime();
		System.out.println(newYear2020);

	}
}
