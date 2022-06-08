package gwaje_2_1;
// 문자와 정수의 데이터 범위를 증명할 수 있는 프로그램 작성
public class DataRange1 {
	public static void main(String[] args) {
		int intMax = Integer.MAX_VALUE;
		int intMin = Integer.MIN_VALUE;
		System.out.println("정수의 데이터 범위 = " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		char charMax = Character.MAX_VALUE;
		char charMin = Character.MIN_VALUE;
		System.out.println("문자의 데이터 범위 = " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
		

	}

}
