package gwaje_2_3;
//전위 연산자와 후위 연산자의 차이를 보여 줄 수 있는 코드 작성
import java.util.Scanner;

public class PrefixPostfix {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		System.out.println("**증가 전위연산자와 후위연산자 비교**");
		int result1 = ++x + 10;
		System.out.println("++x = " + result1);
		int result2 = y++ + 10;
		System.out.println("x++ = " + result2);
		
		int i = 2;
		int n = 2;
		
		System.out.println("**감소 전위연산자와 후위연산자 비교**");
		int result3 = --i + 10;
		System.out.println("--i = " + result3);
		int result4 = n-- + 10;
		System.out.println("n-- = " + result4);
		
		
		
	}

}
