package gwaje_1_4;
//신장별 표준 체중 대응표 표시// (시작값/종료값/증가값) 정수값으로 입력
//표준체중 = (신장 - 100)x0.9
import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 cm부터: ");
		int hMin = stdIn.nextInt(); // 최소 범위 입력
		System.out.println("몇 cm까지: "); // 최대 범위 입력
		int hMax = stdIn.nextInt();
		System.out.println("몇 cm단위: "); // 몇 단위 기준으로 표시할 것인지
		int step = stdIn.nextInt();
		System.out.println("신장 표준 체중");
		System.out.println("---------");
		
		for(int i=hMin; i<=hMax; i+=step)
			System.out.println(i + " " + 0.9 *(i-100));
	}

}
