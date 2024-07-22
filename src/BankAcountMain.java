
class BankAccount {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	BankAccount(){
		
	}
	
	//생성자 함수 만들기
	//this() -> this 생성자 함수
	//this() -> 생성자에서 다른 생성자를 호출 할때(일반 함수에서 this()함수 호출 안됨)
	BankAccount(String accNumber, String ssNumber, int balance) {
		this();
		
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = balance;
	}

	void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}

	// int balance = 0 ; //예금 잔액

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}

	public void checkBalance(BankAccount acc) {
		if (acc != null) {
			acc.checkMyBalance();
		}
	}

}
//1.가리키는 곳이 없음(관계 끊음) = null
//2.개발자들이 사용 하는 용도
//= 슈퍼맨(JVM)으로 하여금 이 객체를 사용하지 않는다는 것을 알려줌
//= 슈퍼맨한테 해당 메모리 정리해도 좋다라는 싸인을 주는 거임
//3.null 활용 == null check를 한다(특히 함수에서 참조형 파라미터 null check필수)

//디폴트 생성자를 언제 컴파일러가 안만들어 주는가? -> 개발자가 생성자를 한개라도 만들었을때.
//컴파일러는 디폴트 생선자를 안넣어준다.

//this 에 관하여.
//this 자기 자신
//용도는 2가지
//this함수, this로 멤버 함수또는 변수 접근


public class BankAcountMain {

	public static void main(String[] args) {
		
		BankAccount noh = new BankAccount();//안만들었든데도 돌아간다.->누군가(컴파일러)가 만들어 준다.
		BankAccount choi = new BankAccount("12-34-56", "80102", 0);
		//choi.initAccount("12-34-56", "80102", 0);//초기화 함수

		// 두 개의 인스턴스 생성
		//BankAccount yoon = new BankAccount();
		//BankAccount park = new BankAccount();

		// 각 인스턴스를 대상으로 예금을 진행
		//yoon.deposit(5000);
		//park.deposit(3000);

		// 각 인스턴스를 대상으로 출금을 진행
		//yoon.withdraw(2000);
		//park.withdraw(2000);

		// 각 인스턴스를 대상으로 잔액을 조회
		//yoon.checkMyBalance();
		//park.checkMyBalance();

		System.out.println();

		//BankAccount ref1 = new BankAccount();
		//BankAccount ref2 = ref1;

		//ref1.deposit(3000);
		//ref2.deposit(2000);
		//ref1.withdraw(400);
		//ref2.withdraw(300);
		//ref1.checkMyBalance();
		//ref2.checkMyBalance();

		//park = null;
		//yoon = null;

		//System.out.println(park);
		//System.out.println(yoon);
	}
}
