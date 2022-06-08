package gwaje_1_11;

import java.util.Scanner;

//임의의 비트를 조작
class SetBit {
	public static void printsBits(int x) {
		//int n = 0;
		for(int i=31; i>=0; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1' : "0"); // i를 이진수로 바꿔서 계산 &이 이진수로 계산하라는 것임
			//n+=1;
		}
	}
	// x의 pos 위치에 있는 비트를 1로 변경한 값을 반환 //
	static int set(int x, int pos) {   //int n = 0;
		return x | (1 << pos);         // n+=1;   // 위치를 1로 변경 
	}
	// x의 pos 위치에 있는 비트를 0으로 변경한 값을 반환 //
	static int reset(int x, int pos) {
		return x & ~(1 << pos); // & -> 삭제 // 다시 0으로 
	}
	// x의 pos 위치에 있는 비트를 반전시킨 값을 반환 //
	static int inverse(int x, int pos) { // 반전 
		return x ^ (1 << pos);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 x의 pos번째 비트를 변경합니다.");
		System.out.print("x: "); int x = stdIn.nextInt();
		System.out.print("pos: "); int pos = stdIn.nextInt();
		
		System.out.print("x                 = "); printsBits(x);
		System.out.print("\nset(x, pos)       = "); printsBits(set(x, pos));
		System.out.print("\nreset(x, pos)     = "); printsBits(reset(x, pos));
		System.out.print("\ninverse(x, pos)   = "); printsBits(inverse(x, pos));
		System.out.println();
	}

}
