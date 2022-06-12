package gwaje_2_4;
// 중첩 for문 사진과 같은 결과 만들 것 
public class NestedLoop {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("i=" + i);
			System.out.print(" j= ");
			for(int j = 0; j <= i; j++) System.out.print(" " + j);
			System.out.println();
		
			}
		System.out.println();
		for(int i = 0; i <= 10; i++)  {
			System.out.print("i=" + i);
			System.out.print(" j=");
			for(int k = 0; k <= i; k++ ) System.out.print(k);
			System.out.println();
		}
		}
	}
		

