package gwaje_1_17.Animal;

class Dog extends Animal {
	private String type;
	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	public void bark() { System.out.println("멍멍!"); }

}
