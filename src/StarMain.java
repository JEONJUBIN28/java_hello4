public class StarMain {
	
	public static void starPrint5(int num) {
		for (int i = 1; i <= num; i++) {//아파트 층수

			for (int j = i; j < num; j++) {//방갯수
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {//방갯수
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
//
//		for (int i = 1; i <= 5; i++)
//			System.out.println("*");
//		System.out.println();
//		for (int i = 1; i <= 5; i++)
//			System.out.print("*");
//		System.out.println();
//		System.out.println();
//		for (int i = 1; i <= 5; i++)
//			System.out.print("*");
//		System.out.println();
//		for (int i = 1; i <= 5; i++)
//			System.out.print("*");
//		System.out.println();
//		for (int i = 1; i <= 5; i++)
//			System.out.print("*");
//		System.out.println();
//		for (int i = 1; i <= 5; i++)
//			System.out.print("*");
//		System.out.println();
//		for (int i = 1; i <= 5; i++)
//			System.out.print("*");
//		System.out.println();
//		System.out.println();
//
		for (int i = 1; i <= 5; i++) {
			// System.out.println("*****");
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//
		for (int i = 1; i <= 5; i++) {// 세로칸수(층수 결정)

			for (int j = 1; j <= i; j++) {// 가로 방수 결정

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//
		for (int i = 1; i <= 5; i++) {// 세로칸수(층수 결정)

			for (int j = 5; j >= i; j--) {// 가로 방수 결정

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) {

				System.out.print(" ");
			}

			for (int j = i; j <= 5; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
//
//		for (int i = 1; i <= 6; i++) {
//
//			for (int j = i; j <= 5; j++) {
//
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j < i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
		for (int i = 1; i < 5; i++) {

			for (int j = i; j < 2; j++) {

				System.out.print("");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 피라미드 구현
		


		for (int i = 1; i <= 5; i++) {//아파트 층수

			for (int j = i; j < 5; j++) {//방갯수
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {//방갯수
				System.out.print("*");
			}
			System.out.println();
		}
		
		starPrint5(5);
	}
}