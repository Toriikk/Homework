package gwaje_1_7;
//배열의 모든 요소에 난수(Random Number)를 대입한 후 막대 그래프로 표시
//요소 수는 키보드로 입력, 마지막에는 인덱스를 10으로 나눈 나머지를 표시할 것
import java.util.Random;
import java.util.Scanner;

public class ColumnChart {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소 수: ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = 1 + rand.nextInt(10);
		
		for(int i=10; i>=1; i--) {
			for(int j=0; j<n; j++)
				if(a[j]>=i)
					System.out.print("* ");
				else 
					System.out.print("  ");
			System.out.println();
		}
		
		for(int i=0; i<2*n; i++)
			System.out.print('-');
			System.out.println();
			
		for(int i=0; i<n; i++)
			System.out.print(i%10 + " ");
			System.out.println();
	}

}
