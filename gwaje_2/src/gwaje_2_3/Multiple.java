package gwaje_2_3;
// 50~100사이 값중에서 3의 배수중 2의 배수를 제외하고 출력
public class Multiple {
	public static void main(String[] args) {

		int n = 0;
		for (n = 50; n <= 100; n++) {
			if(n%3 == 0 && n%2 != 0) {
				System.out.println(n);
			}
		}
	}
}
