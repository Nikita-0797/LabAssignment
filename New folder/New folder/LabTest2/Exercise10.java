import java.util.Arrays;

public class Exercise10 {

	public static void main(String[] args) {

		String[] names = { "Nikita", "Utkarsh", "Pratiksha", "Ajinkya", "Ritesh" };
		int size = names.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].compareTo(names[j]) > 0) {

					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(names));

	}

}