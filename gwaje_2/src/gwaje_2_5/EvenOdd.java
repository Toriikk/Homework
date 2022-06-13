package gwaje_2_5;
// 무한 루틴을 사용하여 1~10까지 짝수와 홀수로 나누어 출력
public class EvenOdd {
	public static void main(String[] args) {
		
		int i = 0; 
		
		while(i<=10) {
			i++;
			if(i>10) break;
			
			if(i%2 == 0) {
				System.out.println("짝수 " + i);
			} else {
				System.out.println("홀수 " + i);
			}		
		}
	}	
}


