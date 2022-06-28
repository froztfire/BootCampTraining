package Week2.Examples.java12;


public class StringUtils {
	public static String clean(String s) {
		return s.replaceAll("\\$", "");
	}
	
	public static String[] words(String s) {
		return s.split(" ");
	}
}
