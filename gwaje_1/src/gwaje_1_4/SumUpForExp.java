package gwaje_1_4;
//1부터 n까지의 합 구하기(계산식을 표시)
import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구하시오");
		
		int x;
		
		do {
			System.out.println("n의 값: ");
			x = stdIn.nextInt();
		} while (x<=0);
		
		int sum = 0;
		
		for(int i=1; i<x; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(x + " = ");
		sum += x;
		System.out.println(sum);
			
	}

}
