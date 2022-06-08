package gwaje_1_5;
//정방형을 표시 //별로 정사각형 만들기
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정방형을 표시합니다.");
		System.out.println("단수는: ");
		
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) 
				System.out.print('*' + " ");
			System.out.println();
		}
	}
		       

}
