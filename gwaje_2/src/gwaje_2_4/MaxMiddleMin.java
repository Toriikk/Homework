package gwaje_2_4;

import java.util.Scanner;

// 10개의 값 중 최대값, 최소값, 중간값을 구해서 출력
public class MaxMiddleMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		int[] num = new int[10];

		System.out.println("숫자 10개를 입력하세요.");
		for(i = 0; i <= 9; i++) {
			num[i] = input.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for(i = 1; i <= 9; i++) {
			if(num[i] > max) max = num[i]; // 최대값
			if(num[i] < min) min = num[i]; // 최소값
		}

		System.out.println("최대값은 " + max + "입니다.");
		System.out.println("최소값은 " + min + "입니다.");

		int size = num.length;

		if(size % 2 == 0){ //배열크기가 짝수일경우

			int m = size / 2;
			int n = size / 2 - 1;

			float result = (float)(num[m] + num[n]) / 2;
			System.out.println("중간값은 " + result + "입니다.");
		}	
	}
}
