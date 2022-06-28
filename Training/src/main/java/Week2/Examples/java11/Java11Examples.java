package Week2.Examples.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.function.Predicate;

public class Java11Examples {
	@FunctionalInterface
	interface Product {
		float multiply(float x, float y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. isBlank
		System.out.println("\n===isBlank===");
		var myBlankWhiteSpaceString = "  ";
		var myBlankString = "";
		var myNonBlankString = "hello";

		System.out.println("myBlankWhiteSpaceString isBlank = " + myBlankWhiteSpaceString.isBlank());
		System.out.println("myBlankString isBlank = " + myBlankString.isBlank());
		System.out.println("myNonBlankString isBlank = " + myNonBlankString.isBlank());

		// 2. strip
		var str = "\n\t	 hello \u2005";
		System.out.println("\n===strip===");
		System.out.println("string trim = " + str.trim());
		System.out.println("string strip = " + str.strip());

		// 3. stripLeading
		System.out.println("\n===stripLeading===");
		System.out.println("strip leading using regex = " + str.replaceAll("^\\s+", ""));
		System.out.println("strip leading using stripLeading = " + str.stripLeading());

		// 4. stripTrailing
		System.out.println("\n===stripTrailing===");
		System.out.println("strip trailing using regex = " + str.replaceAll("\\s+$", ""));
		System.out.println("strip trailing using stripTrailing = " + str.stripTrailing());

		// 5. lines
		System.out.println("\n===lines===");
		var multiline = "A\nB\n\rC\rD";
		multiline.lines().forEach(System.out::println);

		// 6. repeat
		System.out.println("\n===repeat===");
		var str1 = "hello";
		var repeated = str1.repeat(10);
		System.out.println("repeated string = " + repeated);

		// 7. readString
		System.out.println("\n===readString===");
		Path filepath = Paths.get("C:/sample/testFile.txt");
		try {
			String content = Files.readString(filepath);
			content.lines().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 8. writeString
		System.out.println("\n===writeString===");
		Path filepath2 = Paths.get("C:/sample/testWriteFile.txt");
		try {
			Files.writeString(filepath2, "Hello World!", StandardOpenOption.APPEND);
			Files.readString(filepath2).lines().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 9. Predicate not
		System.out.println("\n===predicate not===");
		var multiline2 = "A\nB\n\rC\rD";

		System.out.println("Displaying all lines");
		multiline2.lines().forEach(System.out::println);

		System.out.println("Displaying non blank lines using predicate not");
		multiline2.lines().filter(Predicate.not(String::isBlank)).forEach(System.out::println);

		// 10. var in lambdas
		System.out.println("\n===var in lambdas===");
		Product m1 = (var x, var y) -> x * y;
		System.out.println(m1.multiply(123, 456));

		// limitations, compile error
		// Product m2 = (var x, y) -> x*y;
		// Product m3 = (var x, float y) -> x*y;
		// Product m2 = var x -> x*x;

	}
}
