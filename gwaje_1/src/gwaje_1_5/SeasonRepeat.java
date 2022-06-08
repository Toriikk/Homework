package gwaje_1_5;

import java.util.Scanner;

//입력한 달의 계절 표시(do문 안에 do문이 들어가는 이중 루프)
public class SeasonRepeat {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");
		
		do {
			int month; // 월 저장
			do {
				System.out.println("몇 월입니까?");
				month = stdIn.nextInt();
			} while (month<1 || month >12);
			
			if(month>=3 && month<=5)
				System.out.println("봄입니다.");
			else if(month>=6 && month<=8)
				System.out.println("여름입니다.");
			else if(month>=9 && month<=11)
				System.out.println("가을입니다.");
			else if(month==12 || month==1 || month==2)
				System.out.println("겨울입니다.");
			
			System.out.println("다시 하겠습니까? 1_Yes/0_No : ");
			retry = stdIn.nextInt();
		} while (retry==1);

	}

}
