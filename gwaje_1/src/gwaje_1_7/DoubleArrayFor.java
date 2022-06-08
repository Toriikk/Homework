package gwaje_1_7;
// 요소 개수가 5인 double형 배열, 1.1/2.2/3.3/4.4/5.5 표시
public class DoubleArrayFor {
	public static void main(String[] args) {
		double[] a = new double[5];
		
		for(int i=0; i<a.length; i++)
			a[i] = (i+1) * 1.1;
		
		for(int i=0; i<a.length; i++)
			System.out.println("a[" + i + "]=" + a[i]);
			

	}

}
