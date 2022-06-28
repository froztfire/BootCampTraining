package Week2.Examples.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java12Examples {

	@SuppressWarnings("preview")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. indent
		System.out.println("\n===indent===");
		System.out.println("hello".indent(2));
		var multiline = "This\nis a\nmultiline\nString";
		multiline.lines().forEach(System.out::println);

		System.out.println("\nPositive indent:");
		var indented = multiline.indent(5);
		indented.lines().forEach(System.out::println);

		System.out.println("\nNegative indent:");
		var indentRemoved = indented.indent(-5);
		indentRemoved.lines().forEach(System.out::println);

		System.out.println("\n0 indent:");
		var indentUnchanged = multiline.indent(0);
		indentUnchanged.lines().forEach(System.out::println);

		// 2. transform
		System.out.println("\n===transform===");
		var result = "";
		result = "hello".transform(input -> input + " world");
		System.out.println(result);

		// to return array of words and texts are cleaned of $ signs
		var text = "$some text $with$ $dollars";

		System.out.println("\n===without transform===");
		System.out.println(Arrays.toString(StringUtils.words(StringUtils.clean(text))));

		System.out.println("\n===with transform===");
		System.out.println(Arrays.toString(text.transform(StringUtils::clean)
											   .transform(StringUtils::words)));

		// 3. compact number formatting
		// 3.1 Defaults
		System.out.println("\n===compact number formatting===");
		System.out.println("\n===compact number formatting - default===");
		NumberFormat fmt = NumberFormat.getCompactNumberInstance();

		System.out.println(fmt.format(100));
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(10000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));

		// 3.2 With Locale and Long style
		System.out.println("\n===compact number formatting - US Locale Long Format ===");
		NumberFormat fmtUSLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

		System.out.println(fmtUSLong.format(100));
		System.out.println(fmtUSLong.format(1000));
		System.out.println(fmtUSLong.format(10000));
		System.out.println(fmtUSLong.format(100000));
		System.out.println(fmtUSLong.format(1000000));

		System.out.println("\n===compact number formatting - Germany Locale Long Format ===");
		NumberFormat fmtGELong = NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG);

		System.out.println(fmtGELong.format(100));
		System.out.println(fmtGELong.format(1000));
		System.out.println(fmtGELong.format(10000));
		System.out.println(fmtGELong.format(100000));
		System.out.println(fmtGELong.format(1000000));

		System.out.println("\n===compact number formatting - setting fractional number===");
		NumberFormat fmtWithFraction = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

		fmtWithFraction.setMinimumFractionDigits(3);

		System.out.println(fmtWithFraction.format(10000));
		System.out.println(fmtWithFraction.format(10012));
		System.out.println(fmtWithFraction.format(100201));
		System.out.println(fmtWithFraction.format(1111111));

		System.out.println("\n===compact number formatting - parsing===");
		NumberFormat fmtForParse = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

		try {
			System.out.println(fmtForParse.parse("100"));
			System.out.println(fmtForParse.parse("1 thousand"));
			System.out.println(fmtForParse.parse("10 thousand"));
			System.out.println(fmtForParse.parse("100 thousand"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// 4. File::mismatch
		System.out.println("\n===File::mismatch===");
		Path path1 = Paths.get("C:\\Users\\jerome.garcia\\BootCampTraining\\JavaTraining\\src\\Week2\\Examples\\java12\\fileMismatch-file1.txt");
		Path path2 = Paths.get("C:\\Users\\jerome.garcia\\BootCampTraining\\JavaTraining\\src\\Week2\\Examples\\java12\\fileMismatch-file2.txt");
		Path path3 = Paths.get("C:\\Users\\jerome.garcia\\BootCampTraining\\JavaTraining\\src\\Week2\\Examples\\java12\\fileMismatch-file3.txt");

		try {
			long diff1 = Files.mismatch(path1, path2);
			long diff2 = Files.mismatch(path1, path3);

			System.out.println("Files 1 and 2 are equal = " + diff1);
			System.out.println("Files 1 and 3 are equal = " + diff2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 5. Teeing collector
		System.out.println("\n===File::teeing collector===");
		// first collector sum the values, 2nd collector count all number, function gets the average
		double mean = Stream.of(1, 2, 3, 4, 5).collect(Collectors.teeing(
				Collectors.summingDouble(i -> i),
				Collectors.counting(), 
				(sum, count) -> sum / count));
		
		System.out.println("mean value is = " + mean);
		
		// 6. Switch Expression
		System.out.println("\n===Switch Expression===");
		
		System.out.println("\n===Old Switch Statement fallthrough===");
		int monthNumber_ex1 = 1;
		switch(monthNumber_ex1) {
			case 1: System.out.println("January");
			case 2: System.out.println("February");
			// other cases
			case 12: System.out.println("December");
			default: System.out.println("Unknown");
		}
		
		System.out.println("\n===Old Switch Statement no return value===");
		int monthNumber_ex2 = 1;
		String monthname_ex2 = "";
		switch(monthNumber_ex2) {
			case 1: monthname_ex2 = "January"; break;
			case 2: monthname_ex2 = "February"; break;
			// other cases
			case 12: monthname_ex2 = "December"; break;
			default: System.out.println("Unknown");
		}
		System.out.println("Month=" + monthname_ex2);
		
		System.out.println("\n===Old Switch Statement no new scope===");
		/**
		int monthNumber_ex3 = 1;
		String monthname_ex3 = "";
		switch(monthNumber_ex3) {
			case 1: String temp = "January"; 
					monthname_ex3 = temp; 
					break;
			case 2: // compile error: duplicate variable temp
					String temp = "February";	
					monthname_ex3 = temp; 
					break;
			// other cases
			case 12: {
				// compile error: duplicate variable temp
				String temp = "December";
				monthname_ex3 = temp; 
				break;
			}
			default: System.out.println("Unknown");
		}
		System.out.println("Month=" + monthname_ex3);
		**/
		
		System.out.println("\n===Switch Expression===");
		int monthNumber_ex4 = 1;
		String monthname_ex4 = switch(monthNumber_ex4) {
			case 1 -> "January";
			case 2 -> "February";
			case 3,4,5 -> "Sunny Months";
			case 6,7,8 -> "Rainy Months";
			case 9,10,11,12 -> "Ber Months";
			default -> "Unknown";
		};
		System.out.println("Month=" + monthname_ex4);
		
		System.out.println("\n===Switch Expression - block scope and yield===");
		int monthNumber_ex5 = 1;
		String monthname_ex5 = switch(monthNumber_ex5) {
			case 1 -> { String temp = "January";
						yield temp;
			}
			case 2 -> { String temp = "February";
						yield temp;
			}
			// other cases
			default -> "Unknown";
		};
		System.out.println("Month=" + monthname_ex5);
	}

}
