package gwaje_2_1;
// 강제형 변환 4가지 만들고 출력
public class Casting {
	public static void main(String[] args) {
		int intValue = 103029770;
		byte byteValue = (byte) intValue; // byte로 강제형 변환
		System.out.println("byteValue = " + byteValue);
		
		intValue = 'A';
		char charValue = (char) intValue;
		System.out.println("charValue = " + charValue); // char로 강제형 변환
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println("intValue = " + intValue); // int로 강제형 변환
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue = " + intValue); // int로 강제형 변환
		
		

	}

}
