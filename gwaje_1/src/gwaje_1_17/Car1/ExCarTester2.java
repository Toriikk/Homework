package gwaje_1_17.Car1;

import gwaje_1_16.Day;

public class ExCarTester2 {

	public static void main(String[] args) {
		ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015,12,24));
		
		myCar.putSpec(); // 사양 표시

	}

}
