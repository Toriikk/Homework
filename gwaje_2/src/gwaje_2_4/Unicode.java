package gwaje_2_4;
//문자를 유니코드 변환 프로그램 작성 
import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0; 
		
		do {
			
		System.out.println("문자를 입력하세요.");
		char input = sc.next().charAt(0);
		int uni = input;
		System.out.println(uni);
		System.out.println();
		
		System.out.println("프로그램을 계속하고 싶다면 1, 종료하고 싶다면 0");
		int n = sc.nextInt();
		
		} while (i == 1);
		
		System.out.println("프로그램 종료");
		
	}

}
