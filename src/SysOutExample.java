/*
1.주석을 주면 해당 부분을 컴파일 하지 않음
2.주석의 목적 - 소스코드 설명
*/

/*
 1. 가독성
 
*/

public class SysOutExample {

	public static void main(String[] args) {
		/* System.out.println(7) */;// 정수

		// System.out.println(3.15);//실수
		System.out.println(3 + 5);

		System.out.println("3 + 5");
		System.out.println("3 + 5 = " + 8);// 문자열
		System.out.println("3 + 5 = " + "8");// 문자열로 형변환(치환)한다.
		System.out.println("3 + 5 =8");// 문자열의 연산
		System.out.println("3 + 5 =" + (8 + 5.5));// 정수안에 괄호먼저 연산후 문자열로 치환후 붙는다.
		System.out.println("3 + 5 =" + "13.5");
		System.out.println("3 + 5 =" + 8 + 5.5);
		System.out.println("3 + 5 =85.5");
	}

}
