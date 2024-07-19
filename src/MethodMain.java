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

	public static void starPrint5(int num) {
		for (int i = 1; i <= num; i++) {// 아파트 층수

			for (int j = i; j < num; j++) {// 방갯수
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {// 방갯수
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm입니다.");
	}

	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}

	public static double square(double num) {
		return num * num;
	}

	public static double getAvg(int num1, int num2, int num3) {

		// int total = num1 + num2 + num3;
		// double avg = total/3.0;
		return (num1 + num2 + num3) / 3.0;
		// return avg;
	}

	public static char getGrade(double avg) {
		char grade = '가';

		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		}

		return grade;
	}
	
	public static double getCirleArea(double r){
//		double PI=3.14;
//		double area = r*r*PI;
//		return area;
		return r*r*Math.PI;
	}
	
	public static double getRetangleArea(double width, double heihgt){
		return width*heihgt;
	}
	
	public static void divide(int num1, int num2){
		if(num2==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과: " +(num1 / num2));
	}
	
	
	public static void main(String[] args) {
		
//		int num; // 살아있는 범위가 중괄호.
//		{
//			int num= 10;
//			System.out.println(10);
//		}
//		
//		{
//			int num= 10;
//			System.out.println(10);
//		}
		
		
		
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
		
		
		

//		int result;
//		result = adder(4, 5);
//		System.out.println(result);
//
//		System.out.println(square(3.5));
		
		
		int kor = 80;
		int eng = 70;
		int math = 80;
		

		double avg = getAvg(kor, eng, math);
		char grade = getGrade(avg);

		System.out.println("평균은" + avg + "입니다,");
		System.out.println("성적은" + grade + "입니다.");
		
		
		System.out.println(getCirleArea(10));//314,0~~~~
		
		System.out.println(getRetangleArea(14.5, 16.7));

//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		
//		

		// System.out.println("Hello world");

		// printHello();
		// sayHello();
		// sayHello2();
//		add(5, 7);
//		add(10, 77);
//		add(-2, 7);
//		
//		
//		printStart(4);
//		printStart(3);
//		printStart(2);
//		printStart(1);
//		
//		
//		starPrint5(5);
//		starPrint5(6);
//		starPrint5(7);

	}
}