package gwaje_1_7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		System.out.print("a={");
		if(n>=2)
			for(int i=0; i<n-1; i++)
				System.out.print(a[i] + ", "); //앞에서부터 n-1개 요소 표시
		if(n>=1)
			System.out.print(a[n-1]); // 마지막 요소 표시
		System.out.print("}");
	}

}

