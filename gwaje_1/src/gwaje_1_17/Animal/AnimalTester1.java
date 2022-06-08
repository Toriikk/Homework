package gwaje_1_17.Animal;

public class AnimalTester1 {
	public static void main(String[] args) {
		// 다음 선언은 오류 : 추상 클래스는 인스턴스화 할 수 없다
		// Animal x : new Animal();
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치", "치와와");
		a[1] = new Cat("마이클", 7);
		
		for(Animal s : a) {
			System.out.print(s.getName() + " ");
			s.bark();
			System.out.println();
		
		/* for(int i=0; i,a.length; i++) {
		 * System.out.print(a[i].getName() + " ");
		 * a[i].bark();
		 * System.out.println();	
		 */
		}
		

	}

}
