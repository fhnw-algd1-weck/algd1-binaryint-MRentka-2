package ch.fhnw.algd1.converters.binary;

public class BinConverter {
	public static String toString(int x) {
		// TODO expect x to be in range [-128, 127], return string with 8 binary
		// di gits representing x in 2-complement
		StringBuilder result = new StringBuilder();
		boolean negative = x < 0;
		while(x != 0) {
			result.insert(0, x & 1);
			x /= 2;
		}
		while(result.length() < 8) {
			result.insert(0, '0');
		}
		return result.toString();
	}

	public static int fromString(String text) {
		// TODO expect text to contain 8 binary digits, parse to int value in
		// 2-complement
		return 0;
	}
}