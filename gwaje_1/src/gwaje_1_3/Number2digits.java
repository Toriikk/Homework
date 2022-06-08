package gwaje_1_3;
//2자리 정숫값(10~99) 숫자 맞추기 게임 // 난수 생성과 if문 do문 사용할 것 
import java.util.Random;
import java.util.Scanner;

public class Number2digits {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int no = 10 + rand.nextInt(90);
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		int x;
		
		do { 
			System.out.println("어떤 숫자일까? : ");
			x = stdIn.nextInt();
			
			if (x>no) 
				System.out.println("더 작은 숫자입니다.");
			else if (x<no)
				System.out.println("더 큰 숫자입니다.");
		} while (x != no); // false여야 do-while문 종료
		System.out.println("정답입니다.");

	}

}
