
public class SwitchExample {

	public static void main(String[] args) {

		// 구구단 꼭 외워야한다. 변수명(i, j, k)
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println(); // 한칸 개행시키는것이다.
		}

		// 짝수단만 나오게 하세요.
//		for (int i = 2; i < 10; i++) {
//
//			if (i % 2 != 0)
//				continue;
//			System.out.println(i + "단입니다.");
//
//			for (int j = 1; j < 10; j++) {
//
//				System.out.println(i + "*" + j + "=" + (i * j));
//
//			}
//			System.out.println();
//		}

		// 홀수단만 나오게 하세요.
		for (int i = 2; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

//				int result = i * j;
//				if ((result) % 2 == 1)
				if (i % 2 == 1)
					
				
				System.out.println(i + "*" + j + "=" + (i * j));
		
			}
			System.out.println();
		}

		// continue;
		// 반복문 문장에서 조건검사로 돌아가는것이다.
//		while(true) {
//			System.out.println("Hello world");
//		}

//		do{
//			System.out.println("Hello world");
//		}while(true);

//		for(;true;) {
//			System.out.println("Hello world");
//		}

		// continue 예제 내일 타임워치
//		int num = 0;
//		int count = 0;
//		while ((num++) < 100) {
//			if (((num % 3) != 0) || ((num % 4) != 0))
//				continue;
//			count++;
//			System.out.println(num);
//		}
//		System.out.println("count: " + count);

//		int num = 1;
//		boolean search = false;
//		
//		while(num<100) {
//			if(((num%5)==0)&&((num%7)==0)) {
//				search = true;
//				break;
//			}
//			num++;
//		}
//		
//		if(search)
//			System.out.println(num);
//		else
//			System.out.println("찾지 못했습니다.");

//		int num = 1;
//		while(num<5) {
//			
//			if(num%2==0)
//				continue;
//			
//			System.out.println("hell world");
//			num++;
//		
//		}

		// 1부터 1000까지의 숫자중 11의 배수이자 7의 배수인 첫번째수는?
//
//		for (int i = 1; i <= 1000; i++) {
//
//			if ((i % 7 == 0) && (i % 11 == 0)) {
//			System.out.println(i);
//			break;
//			
//			}
//			
//		}
//
//		for (int i = 1; i <= 100; i++) {
//
//			if (i == 10)
//				break;
//			System.out.println("Hellow world");
//		}

		/////////////////////////////////////////////////////////
//		int count = 1;
//		// while은 if문과 비듯하지만 ()안에 트루일때까지 반복적으로 행하는것.
//		while (count <= 100) {
//			System.out.println(count + "번" + " : Hello world");
//			count++;
//		}
//
//		// 1에서 100까지 3의 배수를 더하는 while문을 사용하시오.
//		int i = 1;
//		int sum = 0;
//		while (i <= 100) {
//
//			if (i % 3 == 0) {
//				sum = sum + i;
//				System.out.println(sum);
//			}
//
//			i++;
//		}

		// do while 사용
		// 차이 = do while 실행문장을 한번은 실행 시킨다.
//		count = 1;
//		do {
//			System.out.println(count + "번" + " : Hello world");
//			count++;
//		} while (count <= 100);
//
//		// for
//
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + "번" + " : Hello world");
//		}

		// 1부터 100까지의 합
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			sum = sum + i;
//			System.out.println(i + ":합:" + sum);
//			
//		}

		// 3단 구구단 출력 무조건 알아야한다.

//		int dan = 3;
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan * i));
//		}
//
//		// 출력이
//		// 1 3 5 7 9 .... 99
//
////		for (int i=1 ; i<=99; i++) {
////			if (i%2==1) {
////			System.out.println(i);
////			}
//
//		for (int i = 1; i <= 99; i += 2) {
//			System.out.println(i);
//		}
//
//		// 100 98 96 ...2
//
//		for (int i = 100; i >= 2; i--) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//
//		// 1부터 100까지의 수중에서 3의 배수가 아닌 수들의 합은?
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			
//			if (i % 3 != 0) {
//				sum = sum + i;
//				System.out.println(sum);
//			}
//		}

//		int month = 1;
//
//		switch (month) {
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("봄입니다.");
//			break;
//		case 4:
//		case 5:
//		case 6:
//			System.out.println("여름입니다.");
//		case 7:
//		case 8:
//		case 9:
//			System.out.println("가을입니다.");
//		case 10:
//		case 11:
//		case 12:
//			System.out.println("겨울입니다.");
//		default:
//			System.out.println("잘못된 입력입니다.");
//		}
//
//		if (month == 3 || month == 4 || month == 5) {
//			System.out.println("봄입니다");
//		} else if (month == 6 || month == 7 || month == 8) {
//			System.out.println("여름 입니다");
//		} else {
//			System.out.println("잘못된 입력입니다.");
//		}
//
//		// 걸리면 break 까지;
//
//		int num = 1;
//
//		switch (num) {
//		case 1:
//			System.out.println("1입니다.");
//			System.out.println("1입니다.");
//			// break;
//		case 2:
//			System.out.println("2입니다.");
//			System.out.println("2입니다.");
//			break;
//		case 3:
//			System.out.println("3입니다.");
//			System.out.println("3입니다.");
//			break;
//		default:
//			System.out.println("디폴트입니다.");
//			System.out.println("디폴트입니다.");
//
//		}
//
//		System.out.println("프로그램을 종료합니다.");

	}

}
