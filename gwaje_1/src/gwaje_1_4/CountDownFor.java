package gwaje_1_4;

import java.util.Scanner;

//양의 정숫값을 0까지 카운트다운(반복 종료 후 x 값은 표시하지 않아도 됨)
public class CountDownFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		
		int x; // 전역변수 
		do {
			System.out.print("양의 정숫값:");
			x = stdIn.nextInt();
		} while (x<=0);   // 양이냐 음이냐 판별 
		
		for(; x>=0; x--)
			System.out.println(x); //x값을 표시
	}

}
