//함수 : class안에 만든다.
//함수이름은 개발자가 정한다 단, 첫글자는 소문자여야한다.
//파라미터 안에는 변수선언이 온다. -> 써먹을때는 값을 넣어주어야한다.
//기능을 만드는것 -> 써먹어야 됨
//main 함수가 아닌 내가 만든 함수에도 함수를 호출할수있다. 
//public static void main 외우기.

//1. say hello 를 출력하는 함수를 만드시오.
//2. say hello 를 5번출력하는 함수를 만드시오.
//3. 두수를 전달받아서 두수의 합을 출력하는 함수를 만드시오.

public class MethodMain {

	public static void printStart(int num) {

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void add(int num1, int num2) {
		int result;
		result = num1 + num2;
		System.out.println(result);
	}

	public static void printHello() {
		// System.out.println("Hello world");
		sayHello2();
	}

	public static void sayHello() {
		System.out.println("say hello");
	}

	public static void sayHello2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("say Hello");
		}
	}

	public static void main(String[] args) {
		// System.out.println("Hello world");

		// printHello();
		// sayHello();
		// sayHello2();
		add(5, 7);
		add(10, 77);
		add(-2, 7);
		
		
		printStart(4);
		printStart(3);
		printStart(2);
		printStart(1);

	}
}