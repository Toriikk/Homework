package gwaje_1_12;
//배열의 복사본 작성 (int[] arraySrchIdx(int[] a))
import java.util.Scanner;

class ArraySearchIndex {
	// 배열 a에서 x와 일치하는 모든 요소의 인덱스를 추출한 배열 반환
	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0;           // x와 일치하는 요소의 개수 
		for(int i=0; i<a.length; i++)
			if(a[i] == x) count++;
		
		int[] c = new int[count--]; // x와 일치하는 인덱스 개수
		for(int i=a.length - 1; count>=0; i--)
			if(a[i] == x)
				c[count--] = i;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소 수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int [num];
		
		for(int i=0; i<num; i++) {  // 배열 차례대로 생성
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("탐색할 값: ");
		int n = stdIn.nextInt();
		int[] b = arraySrchIdx(x, n);
		
		if(b.length == 0)
			System.out.println("일치하는 요소가 없습니다.");
		else {
			System.out.println("일치하는 요소의 인덱스");
			for(int i=0; i<b.length; i++)
				System.out.println(b[i]);
		}
	}
}
