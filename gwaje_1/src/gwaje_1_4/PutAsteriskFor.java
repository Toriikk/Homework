package gwaje_1_4;

// 읽은 개수만큼 * 표시
import java.util.Scanner;

public class PutAsteriskFor {

	public static void main(String[] args) {
		Scanner star = new Scanner(System.in);
		System.out.println("몇 개의 별을 표시할까요?");
		
		int n = star.nextInt();
		
		if(n>0) {			
			for(int i=0; i<n; i++)
				System.out.print('*');
			System.out.println(); // 왜 있는 거지?

		}
	}
}
