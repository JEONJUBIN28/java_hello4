public class Test {

	public static void prinStar(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(" ");

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void prinStar2(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(" ");

			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void prinStar3(int num) {
		for (int i = 0; i <= 5; i++) {

			for (int j = i; j <= num; j++) {

				System.out.print(" ");
			}

			for (int j = 1; j < i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		
		for (int i = 1; i <5; i++) {
			
			System.out.println(" ");
			
			for (int j = i; j < 3; j++) {
				
			}
			
			for (int j = 1; j <= 2*i-1; j++) {
		
			
				System.out.print("*");
			}
			
		}
		System.out.println();

	

	}
}
