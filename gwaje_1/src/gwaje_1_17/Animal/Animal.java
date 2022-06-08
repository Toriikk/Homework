package gwaje_1_17.Animal;

abstract class Animal {
	private String name;
	public Animal(String name) { this.name = name; }
	public abstract void bark();
	public String getName() { return name; }
}
