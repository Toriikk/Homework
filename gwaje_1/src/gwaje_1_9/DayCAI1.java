package gwaje_1_9;
// 요일 영어 단어 학습 프로그램 
// 요일은 난수를 사용해서 생성할 것, 학습자가 원하는만큼 반복할 것, 동일 요일 연속해서 표시하지 말 것 
import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = { "일", "월", "화", "수", "목", "금", "토" };
		String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday",
				"thursday", "friday", "saturday"};

		System.out.println("요일명을 영어 소문자로 입력하시오.");

		int retry; // 다시 한번
		int last = -1; // 배열은 0부터 시작 그래서 -1 

		do {
			int day; // 표시할 요일:0~6의 난수 
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;

			while (true) {
				System.out.println(dayKorean[day] + "요일:");
				String s = stdIn.next();

				if (s.equals(dayEnglish[day])) break; //정답
				System.out.println("틀렸습니다.");
			}
			System.out.println("정답입니다. 다시 한번? 1...Yes/0...No:");
			retry = stdIn.nextInt();
		} while (retry == 1);



	}

}
