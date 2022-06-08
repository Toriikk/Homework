package gwaje_1_17.Animal2;

abstract class Animal2 {
	private String name;
	public Animal2(String name) { this.name = name; }
	public abstract void bark();
	public String getName() { return name; }
	public abstract String toString();
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}
}
