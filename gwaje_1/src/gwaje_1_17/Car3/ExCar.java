package gwaje_1_17.Car3;

class ExCar extends Car {
	public void putSpec() {
		super.putSpec();
		System.out.printf("총 주행 거리 : %.2fkm/n", totalMileage);
	}
}
