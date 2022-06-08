package gwaje_1_4;

import java.util.Scanner;

//양의 정숫값을 0부터 카운트업
public class CountUp {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("카운트업 합니다.");
		
		int x;
		do {
			System.out.println("양의 정숫값");
			x = num.nextInt();
		} while(x<=0);
		
		for(int i=0; i<=x; i++)
			System.out.println(i);

	}

}
