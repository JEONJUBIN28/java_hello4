//이름 짓는법
//1. 낙타(camel case) 표기법(클래스 이름)
//2. 뱀(snake case) 표기법(상수 이름) 단,모두 대문자로 작성, 파이선은 소문자이다.
//3. 일방적인 상수는 소문자로 작성.

//1.변수와 상수의 차이
//변수는 메모리 안의 값이 변할수있기에 변수이고
//상수는 메모리 안에 값이 할당된다면 그 값은 변할수없다, 상수는 한번 초기화되면 그 값을 변경할수없다.
//2.변수의 초기화의 이해 = 변수든 상수든 처음으로 값을 할당
//3.상수의 응용
public class TriangleArea {

	public static void main(String[] args) {

		double width = 100;
		double height = 85;
		
		double area = (width * height/2);

		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		System.out.println("넓이:" + area);
	}

}
