package gwaje_1_17.Account;
// 은행 계좌 클래스(Ver.1)
public class Account {
	private String name;  // 계좌명의
	private String no;    // 계좌번호
	private long balance; // 예금잔고
	
	//--- 생성자 ---//
	Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
	}
	//--- 계좌 명의 확인 ---//
	public String getName() {
		return name;
	}
	//--- 계좌 번호 확인 ---//
	public String getNo() {
		return no;
	}
	//--- 예금 잔고 확인 ---//
	public long getBalance() {
		return balance;
	}
	//---k원 입금---//
	void deposit(long k) {
		balance += k;
	}
	//---k원 출금---//
	void withdraw(long k) {
		balance -= k;
	}
}

