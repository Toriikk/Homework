package gwaje_2_5;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("숫자를 입력하세요.");
		int i = input.nextInt();
		System.out.println(i/0);

	} catch(ArithmeticException e) {
		System.out.println("오류 발생");
		
	}
	}
}
