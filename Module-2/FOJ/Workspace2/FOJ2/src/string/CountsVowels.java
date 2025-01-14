package string;

public class CountsVowels {

	public static int getVowelsCount(String str) {
		int vowelCount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public static void main(String[] args) {
		System.out.println(getVowelsCount("aeiou"));
		System.out.println(getVowelsCount("WELCOME"));
	}

}
