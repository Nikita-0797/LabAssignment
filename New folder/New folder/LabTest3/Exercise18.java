import java.util.Arrays;

public class Exercise18 {

	public static void main(String[] args) {

		String str = "asdfgh";
		if (isAlphabaticOrder(str)) {
			System.out.println("String in an alphabetical order " + str);
		} else {
			System.out.println("String is not in alphabetical order :(");
		}
	}

	static boolean isAlphabaticOrder(String str) {
		int size = str.length();
		char[] chArray = new char[size];
		for (int i = 0; i < size; i++) {
			chArray[i] = str.charAt(i);
		}

		Arrays.sort(chArray);
		for (int i = 0; i < size; i++) {
			if (chArray[i] != str.charAt(i)) {

				return false;
			}
		}
		return true;
	}
}

