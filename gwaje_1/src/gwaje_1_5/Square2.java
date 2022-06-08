package gwaje_1_5;
//정숫값의 제곱 표시(방법2) // n 값을 입력받을 것.
import java.util.Scanner;

public class Square2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정숫값: ");
		int n = stdIn.nextInt();
		
		for(int i=1, j=1; i<=n; i++, j=i*i)
			System.out.println(i + "의 제곱은" + j + "입니다.");

	}

}
