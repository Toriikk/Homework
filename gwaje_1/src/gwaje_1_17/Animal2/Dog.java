package gwaje_1_17.Animal2;

class Dog extends Animal2 {
	private String type;
	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	public void bark() { System.out.println("멍멍!"); }
	public String toString() {
		return type+ "의 " + getName();
	}

}
