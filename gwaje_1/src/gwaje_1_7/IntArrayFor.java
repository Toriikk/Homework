package gwaje_1_7;
//배열의 각 요소에 5, 4, 3, 2, 1을 대입해서 표시 
public class IntArrayFor {
	public static void main(String[] args) {
		int[] a = new int[5]; // 새로운 객체 생성
		
		for(int i=0; i<a.length; i++)
			a[i] = 5-i; // 값을 생성해준다 
		

		for(int i=0; i<a.length; i++) // 값 정리 및 저장
			System.out.println("a[" + i + "]=" + a[i]);
	
	}

}
