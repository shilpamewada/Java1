package PassingarrayAsArguments;

public class  Duplicates{
	public static void main(String[] args) {
		int[] array1 = {2, 2, 3, 2, 2};
		int[] array2 = {1, 2, 3, 4, 5};

		duplicate_digit_times(array1);
		duplicate_digit_times(array2);
	}

	public static void duplicate_digit_times(int[] arr) {
		boolean[] duplicates = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (!duplicates[i]) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						duplicates[j] = true;
						count++;
					}
				}
				if (count > 1) {
					System.out.println(arr[i] + " is repeated " + count + " times");
				}
			}
		}
	}




}

