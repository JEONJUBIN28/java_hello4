public class IfExample {

	public static void main(String[] args) {

//		int kor = 90;
//		int eng = 77;
//		int math = 90;
//
//		if ((kor > eng) && (kor > math)) {
//			System.out.println("최대값 :" + kor + "입니다");
//		} else if ((eng > kor) && (eng > math)) {
//			System.out.println("최대값 :" + eng + "입니다");
//		} else {
//			System.out.println("최대값 :" + math + "입니다");
//		}
//
//		int total = kor + eng + math;
//		double avg = total / 3.0;
//
//		System.out.println("국어 :" + kor);
//		System.out.println("영어 :" + eng);
//		System.out.println("수학 :" + math);
//		System.out.println("평균 :" + avg);
//
//		if (avg >= 90) {
//			System.out.println("성적 :" + "수입니다.");
//		} else if (avg >= 80) {
//			System.out.println("성적 :" + "우입니다.");
//		} else if (avg >= 70) {
//			System.out.println("성적 :" + "미입니다.");
//		} else if (avg >= 60) {
//			System.out.println("성적 :" + "양입니다.");
//		} else {
//			System.out.println("성적 :" + "가입니다.");
//		}

		int num = 5;

		if (num >= 5) {
			num = 10;
		} else {
			num = 20;
		}
		System.out.println(num);

		int result = (num >= 5) ? 10 : 20;
		System.out.println(result);

		int kor = 90;
		int eng = 100;
		int math = 70;
		int max;

		max = kor;

//		max = ((kor > eng) && (kor > math)) ? kor : eng;
		max = (max <= eng) ? eng : max;
		max = (max <= math) ? math : max;

		max = (kor > eng) ? (kor > math ? kor : math) : (eng > math ? eng : math);

		System.out.println(max);

		//

	}
}
