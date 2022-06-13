package gwaje_2_5;

import java.util.InputMismatchException;
import java.util.Scanner;

// 숫자를 입력하지 않으면 Exception이 발생하도록 Try~catch 사용
public class TryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("숫자를 입력하세요.");
			int i = input.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하지 않았습니다.");
		}
	}
}
