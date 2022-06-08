package gwaje_1_1;

import java.util.Scanner;

public class Nagative {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값:");
		int n = stdIn.nextInt();
		
		if(n<0)
			System.out.println("이 값은 음의 값입니다.");
				
	}

}
