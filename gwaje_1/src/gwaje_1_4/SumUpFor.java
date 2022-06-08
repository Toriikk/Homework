package gwaje_1_4;

import java.util.Scanner;

//1부터 n까지의 합 구하기
public class SumUpFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구하시오");
		
		int x;
		
		do { 
			System.out.println("x의 값: ");
			x = stdIn.nextInt();
		} while (x<=0);
		
		int sum = 0;
		for (int i=0; i<=x; i++)
			sum += i;
		System.out.println("1부터 " + x + "까지의 총합 : " + sum);
	}		

}
