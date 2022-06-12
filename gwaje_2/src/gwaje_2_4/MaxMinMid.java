package gwaje_2_4;

import java.util.Arrays;
import java.util.Scanner;

// 10개의 값 중 최대값, 최소값, 중간값을 구해서 출력
public class MaxMinMid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i =0;
		int[] num = new int[10];


		System.out.println("숫자 10개를 입력하세요.");
		for(i = 0; i <= 9; i++) {
			int n = input.nextInt();
			num[i] = n;
		}

		int max = num[0];
		int min = num[0];

		for(i = 1; i < num.length; i++) {
			if(max > num[i]) max = num[i];
			if(min < num[i]) min = num[i];
		}
		System.out.println("최대값은 " + max + " 입니다.");
		System.out.println("최소값은 " + min + " 입니다.");

		Arrays.sort(num); // 오름차순 정렬
		int size = num.length;
		double mid;
		if(size % 2 == 0){  // 배열크기가 짝수일경우
			int m = size / 2;
			int n = size / 2 - 1;
			mid = (double)(num[m] + num[n]) / 2; //중앙값 2개의  평균
			
			System.out.println("중간값은 " + mid + " 입니다.");
		}
		
	}

}
