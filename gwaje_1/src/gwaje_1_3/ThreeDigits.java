package gwaje_1_3;
// 3자리 양의 정숫값(100~999) 읽는 프로그램 // 3자리 양의 정숫값이 아니면 다시 입력하게 만들 것
import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;
		do {
			System.out.println("세 자리의 정숫값:");
			x = stdIn.nextInt();
		} while (x<100 || x>999);
		
		System.out.println("입력한 값은 " + x + "입니다.");

	}

}
