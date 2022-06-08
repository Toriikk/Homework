package gwaje_1_17.Animal2;

public class Cat extends Animal2 {
	private int age; 
	public Cat(String name, int age) {
		super(name); this.age = age;
	}
	public void bark() { System.out.println("냐옹!"); }
	public String toString() {
		return age + "살의 " + getName();
	}

}
