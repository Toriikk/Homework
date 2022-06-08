package gwaje_1_12;

import java.util.Scanner;

// 배열에서 연속되는 n개의 요소를 삭제한 배열 반환
class ArrayRemoveOfN {
	// 배열 a의 a[idx]부터 n개의 요소를 삭제한 배열을 반환
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		if(n < 0 || idx < 0 || idx > a.length)
			return a.clone();
		else {
			if(idx + n > a.length)
				n = a.length - idx;
			int[] c = new int[a.length - n];
			int i = 0;
			for( ; i < a.length - n; i++)
				c[i] = a[i + n];
			return c;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("요소 수 : ");
		int num = stdIn.nextInt();

	}

}
