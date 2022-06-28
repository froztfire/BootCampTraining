package Week2.Examples.java13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.chrono.JapaneseEra;
import java.util.Arrays;
import java.util.List;

public class Java13Examples {
	public static String getformattedText(String parameter) {
		 return """
		            Some parameter: %s
		            """.formatted(parameter);
	}

	public static void main(String[] args) throws IOException {
		//1. switch expression yield
		System.out.println("\n===Switch Expression - yield===");
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
		
		//2. text blocks
		System.out.println("\n===Text blocks===");
		System.out.println("\n==Old way of declaring multiline===");
		String json = "{\n \"firstName\": \"Mau\", \n \"lastName\": \"Tuazon\"\n}";
		
		String json2 = new StringBuilder()
				.append("{\n")
				.append(" \"firstName\": \"Mau\"")
				.append("\n")
				.append(" \"lastName\": \"Tuazon\"")
				.append("\n}")
				.toString();
		
		System.out.println("\nMultiline json =\n" + json);
		System.out.println("\nMultiline json using StringBuilder =\n" + json2);
		
		System.out.println("\n==Text blocks way of declaring multiline===");	
		String json3 = """
			{
			 "firstName": "Mau",
			 "lastName": "Tuazon"
			}""";
		System.out.println("\nMultiline json using text blocks =\n" + json3);
		
		System.out.println("\n==Text blocks formatting===");
		System.out.println(getformattedText("hello world"));
		
		//3. New String methods - stripIndent
		System.out.println("\n===New String methods - stripIndent===");
		String json4 = "" +
		"	{\n"	+
		"		 \"firstName\": \"Mau\",\n" +
		"		 \"lastName\": \"Tuazon\n" +
		"		}";
		System.out.println("\nMultiline json no stripIndent=\n" + json4);
		System.out.println("\nMultiline json with stripIndent=\n" + json4.stripIndent());
		
		//4. New String methods - translateEscapes
		System.out.println("\n===New String methods - translateEsapes===");
		String text = Files.readString(Path.of("C:/sample/translateEscapesInputFile.txt"));
		System.out.println("String with no translateEscapes=" + text);
		System.out.println("String with translateEscapes=" + text.translateEscapes());
		
		//5. New String methods - formatted
		System.out.println("\n==New string method - formatted===");	
		String json5 = """
			{
			 "firstName": "%s",
			 "lastName": "Tuazon"
			}""";
		System.out.println("\nText block with String.format =\n" + String.format(json5, "Mau"));
		System.out.println("\nText block with String.formatted string =\n" + json5.formatted("Mau"));
		
		//6. Unicode 11 to 12.1
		System.out.println("\n==Unicode 12.1 support===");	
		System.out.println("\nJapanese era Reiwa=" + JapaneseEra.valueOf("Reiwa"));
		System.out.println("\nSome of the new emojis=\n");
		
		// yawning face, brown heart, pinching hand
		List<String> emojis = Arrays.asList("\u1F971", "\u1F90E", "\u1F90F");
		emojis.forEach(System.out::println);
		var str = """
				"yawning face": "\u1F971" 
				"brown heart": "\u1F90E"
				"pinching hand": "\u1F90F"
				""";
		System.out.println(str);
		
		
	}

}

