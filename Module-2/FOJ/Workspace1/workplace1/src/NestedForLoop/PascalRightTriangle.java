package NestedForLoop;

public class PascalRightTriangle {

	public static void main(String[] args) {
		for (int i = 1 ; i <= 7 ; i++){
			for (int j = 1; j <= i ; j++){   
				System.out.print(" *");
			}
			System.out.println(" ");
			}
		
		for (int k = 6 ; k>= 1 ; k--){
			for (int l = 1; l <= k ; l++){   
				System.out.print(" *");
			}
			System.out.println(" ");
		}

}
	}


