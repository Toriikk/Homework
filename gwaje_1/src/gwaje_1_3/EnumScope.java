package gwaje_1_3;
// 두 정수 사이의 정수를 작은 것부터 순서대로 표시
import java.util.Scanner;

public class EnumScope {
	public static void main(String[] args) {
		// 입력
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A:"); int a = stdIn.nextInt();
		System.out.print("정수 B:"); int b = stdIn.nextInt();
		//------------------------------------
		//jump문 : 참이면 돌고 아니면 점프 
		if(a > b) { // b가 a보다 크면 교환
			int t = a;// temporal : 일시적인
			a = b;
			b = t;
			//데이터 교환하는 함수 : swap
		}		
		// -----------------------------------
		do {
			System.out.print(a + " ");
			a = a +1;
		} while (a <= b);
		System.out.println();
	}

}
