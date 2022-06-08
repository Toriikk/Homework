package gwaje_2_1;
// 영어 대문자/소문자를 문자 및 숫자로 출력
public class Unicode {
	public static void main(String[] args) {
		char var1 = 'A';
		char var2 = 'a';
		char var3 = 'B';
		char var4 = 'b';
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println();
		
		int uni1 = var1;
		int uni2 = var2;
		int uni3 = var3;
		int uni4 = var4;
		
		System.out.println("A = " + uni1);
		System.out.println("a = " + uni2);
		System.out.println("B = " + uni3);
		System.out.println("b = " + uni4);
	}

}
