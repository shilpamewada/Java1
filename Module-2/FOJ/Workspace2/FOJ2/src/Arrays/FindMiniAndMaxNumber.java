package Arrays;

public class FindMiniAndMaxNumber {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int min = arr[0];
		int max= arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max= arr[i];
			}
		}
		
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
	}

}




