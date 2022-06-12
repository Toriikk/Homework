package gwaje_2_3;

import java.util.Scanner;

// 10진수 2진수로 변환하는 프로그램을 사용자 정의 함수로 생성
public class Bianary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		float num2 = num;

		// 10진수를 2진수로 바꿀 때 몇 번의 나눗셈을 하는지 확인 
		int i = 0; // 이진수 개수
		while (num2 > 0) {
			num2 /= 2;
			i++;
		}
		// 확인된 2진수의 개수를 통해 각 2진수를 배열에 넣음
		float[] arr = new float[i];
		int j = 0;
		num2 = num;
		
		while (num2 > 0) {  // 배열에 2진수 넣기 
			arr[j] = num2 % 2; // 나머지 배열에 넣음
			num2 /= 2;
			j++;
		}
		// 배열 거꾸로 출력 
		System.out.print("10진수 " + num + "의 2진수는 ");
		for (i = arr.length; i > 0; i--) {
			System.out.print(arr[i-1]);
		}
		System.out.println(" 입니다.");

	}
}
