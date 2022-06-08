package gwaje_1_17.Animal2;

public class AnimalTester2 {

	public static void main(String[] args) {
		Animal2[] a = new Animal2[2];
		a[0] = new Dog("뭉치", "치와와");
		a[1] = new Cat("마이클", 7);
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
		for(int i=0; i<a.length; i++) {
			System.out.print("a[" + i + "]= ");
			a[i].introduce();
		}

	}

}
