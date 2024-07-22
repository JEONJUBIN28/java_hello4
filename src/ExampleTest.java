class TV {
	String brand;
	int year;
	int inch;

	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	TV() {
		this.brand = "OO";
		this.year = 1900;
		this.inch = 0;

		// System.out.println(brand + "에서 만든" + year + "년" + inch + "인치");
		show();
	}

	void show() {
		System.out.println(brand + "에서 만든" + year + "년" + inch + "인치");
	}

}

class Grade1 {
	int math, science, english;

	Grade1(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	double average() {
		return (math + science + english / 3);
	}
}

class Song {
	String title;
	String artist;
	String country;
	int year;

	Song() {
	}

	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;

	}

	void show() {
		System.out.println(year + "년" + country + "국적의" + artist + "가 부른" + title);
	}

}

class Circle3 {
	double radius;

	Circle3(double radius) {
		this.radius = radius;
	}

	void getArea() {

		System.out.println(radius * radius * Math.PI);
	}

}

class Rectangle4 {
	double width;
	double height;

	Rectangle4(double width, double height) {
		this.height = height;
		this.width = width;
	}

	void getArea() {
		System.out.println(width * height);
	}

}

class Phone {
	String name;
	String number;

	Phone(String name, String number) {
		this.name = name;
		this.number = number;

	}

	Phone() {
		this.name = "없음";
		this.number = "없음";		
	}
	
	void show() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + number);
		
	}

}

public class ExampleTest {

	public static void main(String[] args) {

		// 1번 문제
		{
			TV myTV = new TV("LG", 2017, 32);
			myTV.show();

			TV myTV2 = new TV();// 00에서 만든 1900년 0인치
		}

		// 2번문제
		{

			int math = 90;
			int science = 80;
			int english = 70;
			Grade1 me = new Grade1(math, science, english);
			System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴

		}

		// 3번 문제
		{
			Song song = new Song("Dancing Queen ", "ABBA", 1978, "스웨덴");
			song.show();
		}

		// 4번 문제
		{
			Circle3 c3 = new Circle3(10);
			c3.getArea();//
		}

		// 5번 문제
		{
			Rectangle4 rec = new Rectangle4(10, 10);
			rec.getArea();//100.0
		}
		
		//6번 문제
		Phone phone = new Phone("홍길동", "010-0000-0000");
		phone.show();

		phone = new Phone("홍길순", "010-1111-1111");
		phone.show();

		phone = new Phone();
		phone.show();

	}
}