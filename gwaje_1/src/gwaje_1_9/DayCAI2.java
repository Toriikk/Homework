package gwaje_1_9;
//요일 영어 단어 학습 프로그램(정답 표시 기능 추가)
import java.util.Random;
import java.util.Scanner;

public class DayCAI2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = { "일", "월", "화", "수", "목", "금", "토" };
		String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday",
				"thursday", "friday", "saturday"};

		System.out.println("요일명을 영어 소문자로 입력하시오.");

		int retry;
		int last = -1;
		do { 
			int day; 
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;

			int action;
			do { 
				System.out.println(dayKorean[day] + "요일");
				String s = stdIn.next();

				if (s.equals(dayEnglish[day])) {
					System.out.println("정답입니다.");
					break;
				}
				System.out.println("틀렸습니다.");
				do {
					System.out.println("어떻게 할까요? 1..재입력 / 0..정답 보기:");
					action = stdIn.nextInt();
				} while (action !=0 && action != 1);
				if (action == 0) 
					System.out.println(dayKorean[day] + "요일은\"" + 
							dayEnglish[day] + "\"입니다");
			} while (action == 1);

			System.out.println("다시 한번? 1...Yes/0...No:");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
	
