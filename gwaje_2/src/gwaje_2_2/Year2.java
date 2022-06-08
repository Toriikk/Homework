package gwaje_2_2;

import java.util.Scanner;

// int year=2004 처럼 년도를 설정하면 홀수/짝수해 인지를 구분하고 윤년까지 구별해서 출력 
public class Year2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int number = 0;
		
		do {
		System.out.println("년도를 입력하세요.");
		 int year = stdIn.nextInt();
		
		if(year % 2 == 0 ) {
			System.out.println("짝수 해입니다.");
		} else {
			System.out.println("홀수 해입니다.");
		}
		
		if(year % 4 == 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
		System.out.println();
		System.out.println("프로그램을 계속하려면 0, 종료하려면 1을 누르세요."); 
		number = stdIn.nextInt();
	
		} while (number == 0);
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
