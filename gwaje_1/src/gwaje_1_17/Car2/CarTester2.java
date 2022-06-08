package gwaje_1_17.Car2;

public class CarTester2 {

	public static void main(String[] args) {
		Car car1  = new Car("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
		
		car1.putSpec();  // 사양 표시

	}

}
